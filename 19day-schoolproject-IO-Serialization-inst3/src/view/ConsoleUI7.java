package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import model.exception.DuplicateTelException;
import model.exception.MemberNotFoundException;
import model.service.SchoolService;
import model.vo.Employee;
import model.vo.Member;
import model.vo.Student;
import model.vo.Teacher;

public class ConsoleUI7 {
	private Scanner scanner = new Scanner(System.in);
	private SchoolService service=new SchoolService();
	public void execute() throws FileNotFoundException, ClassNotFoundException, IOException {
		service.loadData();
		exit: while (true) {
			System.out.println("*******학사관리프로그램을 시작합니다******");
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":
				deleteView();
				break;
			case "3":
				findView();
				break;
			case "4":
				System.out.println("**전체구성원보기**");
				service.printAll();
				break;
			case "5":				
				System.out.println("*******학사관리프로그램을 종료합니다******");
				break exit;// switch 문이 아니라 exit label이 지정된 while문을 벗어난다
			default:
				System.out.println("잘못된 입력값입니다!!");
			}// switch
		} // while
		service.saveData();
		scanner.close();
	}
	/*
	 * step6 등록 기능에 추가 구현 
	 * 1. 입력 구성원을 잘못 입력했을 때 다시 입력받게 처리한다 ( 반복 ) 
	 * 2. 등록 작업 tel을 입력 받는 즉시 중복여부를 확인해서 중복될 경우 다시 입력받게 한다 ( 반복 )  
	 */
	public void addView() {
		String type=null;
		//추가 구현 1. 입력 구성원을 잘못 입력했을 때 다시 입력받게 처리한다 ( 반복 )
		while(true) {
			System.out.println("입력할 구성원 종류를 선택하세요 1.학생 2.선생님 3.직원");
			type=scanner.nextLine();// 학생 선생님 직원 식별값을 type 변수에 저장 
			if(type.equals("1")||type.equals("2")||type.equals("3")) {
				break;//while문을 벗어난다 
			}else {
				System.out.println("1.학생 2.선생님 3.직원 중 하나를 선택하세요");
			}
		}
		//추가 구현 2. 등록 작업 tel을 입력 받는 즉시 중복여부를 확인해서 중복될 경우 다시 입력받게 한다 ( 반복 ) 
		String tel=null;
		while(true) {
			System.out.println("1. 전화번호를 입력하세요");
			tel=scanner.nextLine();
			if(service.findIndexByTel(tel)!=-1) // tel 이 기존에 존재하면 
				System.out.println("입력하신 "+tel+" tel 번호는 중복됩니다. 다시 입력하세요");
			else // tel 이 존재하지 않으면 
				break;
		}
		System.out.println("2. 이름을 입력하세요");
		String name=scanner.nextLine();
		System.out.println("3. 주소를 입력하세요");
		String address=scanner.nextLine();
		// type별로 별도의 메세지를 출력해야 한다 
		Member member=null;
		switch(type) {
		case "1":
			System.out.println("4. 학번을 입력하세요");
			String stuId=scanner.nextLine();
			member=new Student(tel,name,address,stuId);
			break;
		case "2":
			System.out.println("4. 과목을 입력하세요");
			String subject=scanner.nextLine();
			member=new Teacher(tel,name,address,subject);
			break;
		case "3":
			System.out.println("4. 부서를 입력하세요");
			String department=scanner.nextLine();
			member=new Employee(tel, name, address, department);
			break;
		}//switch
		// 사용자에게 입력받은 구성원 정보를 저장하기 위해 SchoolService의 addMember() 를 호출한다 
		try {
			service.addMember(member);
			System.out.println("리스트에 추가:"+member);//정상적으로 등록될 경우 등록된 구성원의 정보를 보여준다 
		} catch (DuplicateTelException e) {// tel 중복될 경우 
			System.out.println(e.getMessage());//tel 이 중복되어 등록불가 라는 메세지를 보여준다 
		}
	}//method
	public void deleteView() {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		String tel=scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel+" tel에 해당하는 구성원을 삭제하였습니다");
		} catch (MemberNotFoundException e) {//tel에 해당하는 구성원이 없을 경우 
			System.out.println(e.getMessage());//예외 메세지를 보여준다
		}
	}
	public void findView() {
		System.out.println("조회할 구성원의 전화번호를 입력하세요");
		String tel=scanner.nextLine();
		try {
			Member member=service.findMemberByTel(tel);
			System.out.println("조회결과:"+member);
		} catch (MemberNotFoundException e) {//tel에 해당하는 구성원이 없을 경우 
			System.out.println(e.getMessage());//예외 메세지를 보여준다 
		}
	}
}





















