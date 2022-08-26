package model.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import model.Interface.SchoolService;
import model.exception.DuplicatedException;
import model.exception.MemberNotException;
import model.vo.Employee;
import model.vo.Member;
import model.vo.Student;
import model.vo.Teacher;
public class ConsoleUI {
	private Scanner scanner = new Scanner(System.in);
	SchoolService service = new SchoolService();	
	public void execute() throws FileNotFoundException, IOException, ClassNotFoundException {
		service.info(); // 역직렬화
		System.out.println("*******학사관리프로그램을 시작합니다******");
exit: while(true) {	
		// 시작할때 무한반복 돌때 메모장 객체 불러옴 
		System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
		String menu = scanner.nextLine();
		switch(menu) {
		case "1": addMember(); break;
		case "2": deleteMember(); break;
		case "3": findMember(); break;
		case "4":
			System.out.println("**전체구성원보기**");
			service.printAll(); break;
		case "5": // 종료할때 파일에 객체 저장 직렬화 
			service.save();
			System.out.println("*******학사관리프로그램을 종료합니다******");
			break exit;
		default :
			System.out.println("잘못된 입력값입니다!!");	
			}
		}
	}
	public void addMember() {
		String type = null;
		String tel= null;
	while(true) {
		System.out.println("입력할 구성원의 종류를 선택하세요 1.학생 2.선생님 3.직원");
		type = scanner.nextLine();
		if(type.equals("1")||type.equals("2")||type.equals("3")) {
			break;
		}
	}
	while(true) {	
		System.out.println("1. 전화번호를 입력하세요!");
		tel = scanner.nextLine();
		if(service.findIndexMember(tel) != -1) {
			System.out.println("입력하신 "+tel+" tel 번호는 중복됩니다. 다시 입력하세요!");
		} else 
		break;
	}
		System.out.println("2. 이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("3. 주소를 입력하세요!");
		String address = scanner.nextLine();

		Member member = null;
		switch(type) {
		case "1":
			System.out.println("4. 학번을 입력하세요");
			String stuid = scanner.nextLine();
			member = new Student(tel, name, address, stuid);
			break;
		case "2":
			System.out.println("4. 과목을 입력하세요");
			String subject = scanner.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. 부서를 입려갛세요");
			String department = scanner.nextLine();
			member = new Employee(tel, name, address, department);
		}
		try {
			service.addMember(member);
			System.out.println("리스트에 추가 : " + member);
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findMember() {
		System.out.println("조회할 구성원의 전화번호를 입력하세요");
		String tel = scanner.nextLine();
		try {
			Member member = service.findMemberByTel(tel);
			System.out.println("조회결과 : "+member);
		} catch (MemberNotException e) {
			System.out.println(e.getMessage());
		}
	}
	public void deleteMember() {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		String tel = scanner.nextLine();
		if(service.findIndexMember(tel) != -1) {
			try {
				service.deleteMember(tel);
			} catch (MemberNotException e) {
				e.printStackTrace();
			}
		}
	}
}
