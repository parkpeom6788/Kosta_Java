package test.step2;

import model.service.SchoolService;
import model.vo.Employee;
import model.vo.Member;
import model.vo.Student;
import model.vo.Teacher;
public class TestCaseFind {
	public static void main(String[] args) { 
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "임상현", "용인", "17"));
		service.addMember(new Teacher("0101231235", "차재명", "수지", "국어"));
		service.addMember(new Student("0101231236", "박채은", "수원", "16"));
		service.addMember(new Employee("0101231237", "김민석", "화성", "재무부"));
		service.addMember(new Student("0101231238", "문준호", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김예린", "용인", "수학")); 
		service.printAll(); // 6명 확인
		System.out.println("**학교 구성원 등록 완료**");
		String tel = "0101231230"; // 리스트에 존재하지 않는 (등록되지 않은 ) Tel
		Member member = service.findMemberByTel(tel); // 학교 구성원 정보 - Member 타입으로 받음 
		System.out.println(tel + " tel 구성원 검색 결과 : " + member); 
		// 0101231230 tel 구성원 검색 결과 : null 이 나와야함
		tel ="0101231237"; // // 리스트에 존재 하는 (등록된 ) Tel 
		member = service.findMemberByTel(tel);
		System.out.println(tel + " tel 구성원 검색 결과 : " + member); 
		// 0101231230 tel 구성원 검색 결과 :  Employee [tel=0101231237, name=김민석, address=화성, department : 재무부]
	}
}