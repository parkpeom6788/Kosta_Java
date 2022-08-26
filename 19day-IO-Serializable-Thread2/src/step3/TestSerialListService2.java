package step3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/*
 * 파일에 직렬화 되어 저장된 리스트 객체를 
 * 역직렬화 하여 확인하는 예제(메모리상태로 만듬)
 */
public class TestSerialListService2 {
	public static void main(String[] args) {
		SerialListService service = new SerialListService();
		ArrayList<Car>	list;
		try {
			list = service.deSerialCarList();
			// 향상된 for문
			for(Car car : list) {
				System.out.println(car.getModel() + " " + car.getColor());
				System.out.println("*****");
			}
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getModel() + " " + list.get(i).getColor());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}