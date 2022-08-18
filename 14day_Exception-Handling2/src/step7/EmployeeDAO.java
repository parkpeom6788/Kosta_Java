package step7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// DAO : Data Access Object
public class EmployeeDAO {
	public String findEmployee(String url , String id) throws SQLException {
		String result = null;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url); // checked exception SQLException
			System.out.println("C");
		} finally {
			if(con != null)
				con.close();
				System.out.println("D");
		}
		System.out.println("E");
		return result; 
	}
}



