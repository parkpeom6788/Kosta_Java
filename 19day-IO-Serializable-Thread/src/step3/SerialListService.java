package step3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import common.Path;
public class SerialListService {
	private String filePath=Path.TEST_DIR +"carList.obj";
	public void serializeCarList(ArrayList<Car> list) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
	try {
		oos = new ObjectOutputStream(new FileOutputStream(filePath));
		oos.writeObject(list);
		} finally {
			if(oos != null)
				oos.close();
		}
	}
	@SuppressWarnings("unchecked") // 체크하지않겠다 표식 
	public ArrayList<Car> deSerialCarList() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ArrayList<Car> list = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			list= (ArrayList<Car>)ois.readObject(); // object 를 list로 다운캐스팅
			// Object to ArrayList<Car> 를 보장할수없다고 해서 노란줄뜸 위에 에너테이션 추가 
		} finally {
			if(ois != null)
				ois.close();
		}
		return list;
	}
}
