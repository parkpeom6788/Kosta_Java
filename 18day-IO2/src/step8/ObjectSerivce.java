package step8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectSerivce {
	private String savePath;
	
	 public ObjectSerivce(String savePath) {
		 this.savePath = savePath;
	}
	public void executeSerialize(Person person) throws FileNotFoundException, IOException {
		
		ObjectOutputStream oos = null;
	try {	
		oos = new ObjectOutputStream(new FileOutputStream(savePath));
		oos.writeObject(person);
		} finally {
			if(oos != null)
				oos.close(); // 파일의 제어권을 넘겨줘야 되므로 close 를 꼭 한다.
		}
	}
	public Person executeDeSerialize() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
	try {	
		ois = new ObjectInputStream(new FileInputStream(savePath));
		Object obj = ois.readObject();
		Person person = (Person)obj;
		return person;
	} finally {
		if(ois != null)
			ois.close();
		}
	}
}
