package step7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import common.Path;
import step6.Car;
/*
 * 객체 직렬화하여 파일에 저장된 정보를 다시 역직렬화하여
 * 메모리로 복원해서 확인하는 예제
 */
public class TestObjectInput { // 역직렬화
	public static void main(String[] args) {
		String filePath = Path.TEST_DIR+"car.obj";
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
				Car car = (Car)ois.readObject(); // Object -> Car 다운캐스팅 
				System.out.println(car.getModel() + " " + car.getPrice());
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
}
