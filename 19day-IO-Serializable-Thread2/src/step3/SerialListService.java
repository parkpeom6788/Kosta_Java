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
	private String filePath = Path.TEST_DIR+"carList.obj";
	
	public SerialListService() {}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Car> deSerialCarList() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream  ois = null;
		ArrayList<Car> list = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			Object obj = ois.readObject();
			list = (ArrayList<Car>)obj;
		} finally {
			if(ois!=null)
				ois.close();
		}
		return list;
	}
	public void serializeCarList(ArrayList<Car> list) throws FileNotFoundException, IOException {
		ObjectOutputStream  oos = null;
		try {
				oos = new ObjectOutputStream(new FileOutputStream(filePath));
				oos.writeObject(list);
			}finally {
				if(oos!=null)
					oos.close();
		}
	}
}
