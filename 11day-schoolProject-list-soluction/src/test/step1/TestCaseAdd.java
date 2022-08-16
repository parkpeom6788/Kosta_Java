package test.step1;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;
public class TestCaseAdd {
	public static void main(String[] args) { 
		//System.out.println(new Student("0101231234", "임상현", "용인", "17"));
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "임상현", "용인", "17"));
		service.addMember(new Teacher("0101231235", "차재명", "수지", "국어"));
		service.addMember(new Student("0101231236", "박채은", "수원", "16"));
		service.addMember(new Employee("0101231237", "김민석", "화성", "재무부"));
		service.addMember(new Student("0101231238", "문준호", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김예린", "용인", "수학")); 
		// 아래는 중복 테스트
		// 0101231234 tel 이 중복되어 추가될 수 없습니다
		service.addMember(new Student("0101231234", "아이유", "잠실", "18"));
		System.out.println("***학교 구성원 등록 완료***");
		service.printAll();// 6명의 정보가 출력
		
	}
}