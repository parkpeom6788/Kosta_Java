package step6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import common.Path;

/*
 * 객체를 직렬화 하여 외부 파일에 전송하여 저장한다.
 */
public class TestObjectOutput { 
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Car car = new Car("sm6",3000);
		ObjectOutputStream oos = null;
		
	try {
		String filePath = Path.TEST_DIR + "car.obj";
		oos = new ObjectOutputStream(new FileOutputStream(filePath));
		oos.writeObject(car);
		oos.close();
		System.out.println("객체 직렬화 하여 Car 객체를 파일에 저장 ");
		} finally {
			if(oos != null)
				oos.close();
		}
	}
}
