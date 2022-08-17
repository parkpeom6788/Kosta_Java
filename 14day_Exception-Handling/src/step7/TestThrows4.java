package step7;

import java.sql.SQLException;
// throws 사례 : DB 설치되어 있지 않고 URL이 없으므로
// 아래 코드는 findEmployee() 메서드의 getConnection 부분에서 
// SQLException 이 발생된다.
//  이때 코드의 실행 흐름을 예상해보는 예제  D,B 
// 현재 코드는 Exception 관련 keyword 를 확인하는 예제이므로
// IO 또는 DB 관련 코드는 이후 자세히 설명  
public class TestThrows4 {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		try {
			String result = dao.findEmployee("java", "db url"); // main에서는 try - catch
			System.out.println("DB연동 결과 : " + result);
			System.out.println("A");
		} catch (SQLException e) {
			System.out.println("B");
			e.printStackTrace();
		} 
	}
}
