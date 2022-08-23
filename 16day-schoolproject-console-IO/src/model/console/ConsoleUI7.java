package model.console;
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
		private SchoolService service = new SchoolService();
		public void execute() {
	exit:	while(true) {	
			System.out.println("*******학사관리프로그램을 시작합니다******");
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			
			String menu = scanner.nextLine();
			
			switch(menu) {
				case "1": addView(); break;
				case "2": deleteView(); break;
				case "3": service.printAll(); break;
				case "4": break;
				case "5": 
					System.out.println("*******학사관리프로그램을 종료합니다******");
					break exit;
				default :
					System.out.println("잘못된 입력값입니다!!");
				}	
			}
		}
		public void addView() {
			String type =null;
			String tel = null;
		while(true) {	
			System.out.println("입력할 구성원의 종류를 선택하세요 1.학생 2.선생님 3.직원");
			type = scanner.nextLine();
			
			if(type.equals("1")||type.equals("2")||type.equals("3")) {
				break;
			} else {
				System.out.println("입력할 구성원의 종류를 다시 선택하세요");
			}
		}	
		while(true) {	
			System.out.println("1. 전화번호를 입력하세요!");
			tel = scanner.nextLine();
			if(service.findIndexByTel(tel) != -1) {
				System.out.println("입력하신 "+ tel + " tel 번호는 중복됩니다. 다시 입력하세요!");
			}
			else 
				break;
			}
			System.out.println("2. 이름을 입력하세요!");
			String name = scanner.nextLine();
	
			System.out.println("3. 주소를 입력하세요!");
			String address = scanner.nextLine();
			
			Member member = null;
			switch(type) {
			case "1": 
				System.out.println("4. 학번을 입력하세요!");
				String stuid = scanner.nextLine();
				member = new Student(tel, name, address, stuid);
				break;
			case "2": 
				System.out.println("4. 과목를 입력하세요!");
				String subject = scanner.nextLine();
				member = new Teacher(tel, name, address, subject);
				break;
			case "3": 
				System.out.println("4. 부서를 입력하세요!");
				String department = scanner.nextLine();
				member = new Employee(tel, name, address, department);
				break;
			}
		try {
			service.addMember(member);
			System.out.println("리스트에 추가 : " + member);	
		} catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
			}
		}
		public void deleteView() {
			System.out.println("삭제할 구성원의 전화번호를 입력하세요");
			String tel = scanner.nextLine();
			try {
				service.deleteMemberByTel(tel);
			} catch (MemberNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		public void findView() {
			System.out.println("조회할 구성원의 전화번호를 입력하세요");
			String tel = scanner.nextLine();
			try {
				service.findMemberByTel(tel);
			} catch (MemberNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
}
