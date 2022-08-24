package step8;
import java.io.IOException;
import common.Path;
/*
 * 객체 역직렬화
 */
public class TestObjectService2 {
	public static void main(String[] args) {
		String savePath = Path.TEST_DIR +"person.obj";
		ObjectSerivce service = new ObjectSerivce(savePath);
		// try 
				Person p = null;
				try {
					p = service.executeDeSerialize();
		//catch
				System.out.println("객체 역직렬화하여 객체로 복원");
				System.out.println("이름 : " + p.getName() + "나이 : " + p.getAge());
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
			}
	}
}
