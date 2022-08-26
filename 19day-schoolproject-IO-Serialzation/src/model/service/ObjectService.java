package model.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import common.Path;
import model.vo.Member;

// 직렬화 (파일이 없을때 파일을 만들어줌)
public class ObjectService {
	File file = new File(Path.TEST_DIR);
	public void serizable(ArrayList<Member> list) throws FileNotFoundException, IOException {
		if(file.isDirectory() == false) 
			file.createNewFile();
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
		} finally {
			if(oos != null)
				oos.close();
		}
	}
	// 역직렬화 
	@SuppressWarnings("unchecked")
	public ArrayList<Member> deserizable() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ArrayList<Member> list = null;
		if(file.isFile()) { 
//			file.createNewFile();
		try {
			ois = new ObjectInputStream(new FileInputStream(file)); // FileInputStream 내부객체에서 파일을 만든다.
			Object obj = ois.readObject();
			list = (ArrayList<Member>)obj;
		} finally {
			if(ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	return list;
	}
}
