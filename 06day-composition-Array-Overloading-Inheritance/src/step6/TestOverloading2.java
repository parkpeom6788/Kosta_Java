package step6;
// 생성자 오버로딩의 예
public class TestOverloading2 {
		public static void main(String[] args) {
			Employee  e1 = new Employee();
			System.out.println(e1.getDepartment()); // null
			Employee e2 = new Employee("아이유");
			System.out.println(e2.getName() + " " + e2.getSalary() + e2.getDepartment()); // 아이유 0 null
			
			Employee e3 = new Employee("아이유",400);
			System.out.println(e3.getName() + " "
					+ e3.getSalary() + " " + e3.getDepartment());
			
			Employee e4 = new Employee("아이유",400,"3");
			System.out.println(e4.getName() + " "
					+ e4.getSalary() + " " + e4.getDepartment());
			
		}
}
