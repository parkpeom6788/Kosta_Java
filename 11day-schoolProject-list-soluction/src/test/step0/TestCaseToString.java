package test.step0;
import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;
// TDD : 테스트케이스 잘나오는지 확인하는 클래스
public class TestCaseToString {
	public static void main(String[] args) {
		//toString() test
		System.out.println(new Student("0101231234", "임상현", "용인", "17"));
		Teacher t = new Teacher("0101231235", "차재명", "수지", "국어");
		System.out.println(new Employee("0101231237", "김민석", "화성", "재무부"));
		System.out.println(t.toString());
		SchoolService service = new SchoolService();
	}
}
