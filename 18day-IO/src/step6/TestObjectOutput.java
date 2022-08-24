package step6;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import common.Path;
/*
 *  객체를 직렬화 하여 외부 파일에 전송하여 저장
 */
public class TestObjectOutput { // 직렬화 
	public static void main(String[] args) {
		Car car = new Car("sm6",3000);
		try {
			String filePath = Path.TEST_DIR+"car.obj";
			ObjectOutputStream oos
			= new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(car); // 객체대입 
			oos.close();
			System.out.println("객체 직렬화 하여 Car 객체를 파일에 저장");
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}
