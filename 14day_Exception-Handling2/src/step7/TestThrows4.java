package step7;

import java.sql.SQLException;
 
public class TestThrows4 {
	public static void main(String[] args) {
	
		EmployeeDAO dao = new EmployeeDAO();	
		String result;
		try {
			result = dao.findEmployee("java", "db url"); // main에서는 try-catch
			System.out.println("DB연동 결과 : " + result);
			System.out.println("A");
		} catch (SQLException e) {
			System.out.println("B");
			e.printStackTrace();
		}
	}
}
