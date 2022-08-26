package step3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class TestSerialListService {
	
	public static void main(String[] args) {
		
		SerialListService service = new SerialListService();
		ArrayList<Car> list = new ArrayList<>();
		
		list.add(new Car("소나타","white"));
		list.add(new Car("sm6","red"));
		list.add(new Car("k5","black"));
		
		try {
			service.serializeCarList(list);
			System.out.println("자동차 리스트를 직렬화 하여 파일에 저장 ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
