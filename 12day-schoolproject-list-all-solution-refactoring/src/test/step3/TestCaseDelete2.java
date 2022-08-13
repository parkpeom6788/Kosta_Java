package test.step3;

import model.Employee;
import model.SchoolService;
import model.SchoolServiceImplVer2;
import model.Student;
import model.Teacher;
public class TestCaseDelete2 {
	public static void main(String[] args) { 
		SchoolService service = new SchoolServiceImplVer2();
		service.addMember(new Student("0101231234", "임상현", "용인", "17"));
		service.addMember(new Teacher("0101231235", "차재명", "수지", "국어"));
		service.addMember(new Student("0101231236", "박채은", "수원", "16"));
		service.addMember(new Employee("0101231237", "김민석", "화성", "재무부"));
		service.addMember(new Student("0101231238", "문준호", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김예린", "용인", "수학")); 
		service.printAll(); // 6명 확인
		System.out.println("**학교 구성원 등록 완료**");
		String tel = "01012311230"; // 존재하지 않는 tel 
		service.deleteMemberByTel(tel);
		tel = "0101231238"; // 존재하는 tel : 문준호님 번호 입니다.
		service.deleteMemberByTel(tel);
		//0101231238 tel 에 해당하는 구성원 정보가 삭제되었습니다.
		System.out.println("전체 구성원 리스트 출력");
		service.printAll(); // 5명이 출력된다. 
	}
}