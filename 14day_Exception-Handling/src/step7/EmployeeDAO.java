package step7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// DAO : Data Access Object
public class EmployeeDAO {
	public String findEmployee(String url , String id) throws SQLException { // throws 메인쪽에서 처리
		String result = null;
		// database 연결하기 위한 객체 
		Connection con = null;
		try {
			con = DriverManager.getConnection(url); // checked exception
			System.out.println("C");
		} finally {
			if(con != null) // con 이 null 아니고 존재하면   
			con.close(); // 반드시 close 처리 한다 
			System.out.println("D");
		}
		System.out.println("E");
		return result;
	}
}



