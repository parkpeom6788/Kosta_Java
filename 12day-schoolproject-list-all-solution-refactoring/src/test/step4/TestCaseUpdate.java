package test.step4;

import model.Employee;
import model.Member;
import model.SchoolService;
import model.SchoolServiceImpl;
import model.Student;
import model.Teacher;
public class TestCaseUpdate {
	public static void main(String[] args) { 
		SchoolService service = new SchoolServiceImpl();
		service.addMember(new Student("0101231234", "임상현", "용인", "17"));
		service.addMember(new Teacher("0101231235", "차재명", "수지", "국어"));
		service.addMember(new Student("0101231236", "박채은", "수원", "16"));
		service.addMember(new Employee("0101231237", "김민석", "화성", "재무부"));
		service.addMember(new Student("0101231238", "문준호", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김예린", "용인", "수학")); 
		service.printAll(); // 6명 확인
		System.out.println("**학교 구성원 등록 완료**");
		service.updateMember(new Teacher("0101231230", "차재명", "동탄", "자바"));
		//0101231230 tel에 해당하는 구성원 정보가 없어 수정불가합니다
		service.updateMember(new Employee("0101231235","차재명","성남","기획"));
		//0101231230 tel에 해당하는 구성원 정보에 해당하는 구성원 정보가 수정되었습니다
		System.out.println("**학교 구성원 정보 수정후 결과 테스트**");
		service.printAll();
		System.out.println("**학교 구성원 수정 테스트 완료**");
		
	}
}