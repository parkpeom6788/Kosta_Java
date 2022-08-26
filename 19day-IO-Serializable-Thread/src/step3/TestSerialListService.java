package step3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/*
 * ArrayList<Car> 리스트 객체를 직렬화하여 파일에 저장
 * Collection 계열의 list , Map , Set 구현체들은
 * implements Serializable 처리가 되어 있다 
 * ( Serializable 계층구조 하에 있다 )
 * 
 * Element 즉 요소로 저장되는 Car class 또한
 * implements Serializable 을 해야 한다  
 */
public class TestSerialListService {
	
	public static void main(String[] args) {
		
		SerialListService service = new SerialListService();
		ArrayList<Car> list = new ArrayList<>();
		
		list.add(new Car("소나타","white"));
		list.add(new Car("sm6","red"));
		list.add(new Car("k5","black"));
		//try
		try {
			service.serializeCarList(list);
			System.out.println("자동차 리스트를 직렬화하여 파일에 저장");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//catch
	}
}
