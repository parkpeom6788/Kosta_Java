package step8;

import java.io.IOException;

import common.Path;

/*
 * 객체 직렬화 연습 예제 - 7번 예제 참고 
 */
public class TestObjectService {
	public static void main(String[] args) {
		Person person = new Person("아이유",30);
		String savePath = Path.TEST_DIR +"person.obj";
		ObjectSerivce service = new ObjectSerivce(savePath);
		// try 
			try {
				service.executeSerialize(person);
				System.out.println("객체 직렬화하여 파일에 저장");
		//catch
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
