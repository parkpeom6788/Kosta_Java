package test.step5;

import model.Employee;
import model.SchoolService;
import model.SchoolServiceImplVer2;
import model.Student;
import model.Teacher;

public class TestCaseFindindex {
	public static void main(String[] args) {
		SchoolService service = new SchoolServiceImplVer2(); // 인터페이스 = new 구현체
		// 테스트를 위해 구성원을 추가한다
		service.addMember(new Student("0101231234", "임상현", "용인", "17"));
		service.addMember(new Teacher("0101231235", "차재명", "수지", "국어"));
		service.addMember(new Student("0101231236", "박채은", "수원", "16"));
		service.addMember(new Employee("0101231237", "김민석", "화성", "재무부"));
		service.addMember(new Student("0101231238", "문준호", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김예린", "용인", "수학")); 
		String tel ="0101231239";
		
		int position = service.findIndexByTel(tel);
		System.out.println(tel+ " tel position : " + position); // 5
		
		tel = "0101231235"; 
		position = service.findIndexByTel(tel);
		System.out.println(tel+ " tel position : " + position); // 1
		
		tel = "0101231230"; 
		position = service.findIndexByTel(tel);
		System.out.println(tel+ " tel position : " + position); // -1
		

		
	}
}
