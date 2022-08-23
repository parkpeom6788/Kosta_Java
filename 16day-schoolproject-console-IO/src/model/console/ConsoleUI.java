package model.console;
import java.util.Scanner;

import model.exception.DuplicateTelException;
import model.exception.MemberNotFoundException;
import model.service.SchoolService;
import model.vo.Employee;
import model.vo.Member;
import model.vo.Student;
import model.vo.Teacher;
public class ConsoleUI {
	private Scanner scanner;
	private SchoolService service;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int FIND = 3;
	private static final int SHOW = 4;
	private static final int EXIT = 5;
	private static final int STUDENT = 1;
	private static final int TEACHER = 2;
	private static final int EMPLOYEE = 3;
	private String tel,name,address,stuid,department,subject;
	int choice;
	private boolean flag = true;
	public ConsoleUI() {
		scanner = new Scanner(System.in);
		service = new SchoolService();
	}
	public void execute() {
		System.out.println("******학사관리프로그램을 시작합니다******");
		do {
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5. 종료");
			choice = scanner.nextInt();
			switch(choice) {
			case ADD: addView(); break;
			case DELETE: deleteView(); break;
			case FIND: findView(); break;
			case SHOW: service.printAll(); break;
			case EXIT: System.out.print("******학사프로그램을 종료합니다******");  System.exit(0); break;
			default :
				System.out.println("잘못된 입력값입니다!!");
			}
		} while(!(1 > choice || choice > 6));
	}
	
	public void addView() {	
	exit : while(flag) {		
			System.out.println("입력할 구성원의 종류를 선택하세요 1.학생 2. 선생님 3. 직원");
			choice = scanner.nextInt();
	try {
		switch(choice) {
				case STUDENT:
					pilsu(); printStudent(); service.addMember(new Student(tel, name, address, stuid));
					break exit;
				case TEACHER: 
					pilsu(); printTeacher(); service.addMember(new Teacher(tel, name, address, subject));
					break exit;
				case EMPLOYEE:
					pilsu(); printEmployee(); service.addMember(new Employee(tel, name, address, department));
					break exit;	
				default : // 그외 번호를 입력했을때
					System.out.println("다시 입력하세요");
					flag =  false;	
					 }
				} catch(DuplicateTelException e) {
						System.out.println(e.getMessage());
				}
				flag = true;
	 		}
		}
	public void deleteView() {
		scanner.nextLine();
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		tel = scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel + "삭제 완료");
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public void findView() {
		scanner.nextLine();
		System.out.println("조회할 구성원의 전화번호를 입력하세요");
		tel = scanner.nextLine();
		try {
			Member member = service.findMemberByTel(tel);
			System.out.println(member);
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public void pilsu() {	// 필수입력메서드	
	scanner.nextLine();
	boolean flag = true;
	do {
		System.out.println("1. 전화번호를 입력하세요!");
		tel = scanner.nextLine();
			if(service.findIndexByTel(tel) != -1) {
				System.out.println("번호가 중복됩니다.");
				flag = true;
			} else 
				flag = false;
	} while(flag);
		System.out.println("2. 이름을 입력하세요");
		name = scanner.nextLine();
		System.out.println("3. 주소를 입력하세요");
		address = scanner.nextLine();	
	}
	
	public void printStudent() { // 학생입력
		System.out.println("4. 학번을 입력하세요");
		stuid = scanner.nextLine();
	}
	
	public void printTeacher() { // 선생입력
		System.out.println("4.과목를 입력하세요");
		subject = scanner.nextLine();
	}
	
	public void printEmployee() { // 직원 입력 
		System.out.println("4.부서번호를 입력하세요");
		department = scanner.nextLine();
	}
}
