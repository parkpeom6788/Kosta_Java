package step7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import common.Path;
import step6.Car;

/*
 * 객체 직렬화 하여 파일에 저장된 정보를 다시 역직렬화 하여 메모리에 복원해서 확인하는 예제
 */
public class TestObjectInput {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String filePath = Path.TEST_DIR+"car.obj";
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			Object obj = ois.readObject(); // Object로 받는다 !!! 
			Car car = (Car)obj; // 다운캐스팅!!!
			System.out.println(car.getModel() + " "+ car.getPrice());
		} finally {
			
		}
	}
}
