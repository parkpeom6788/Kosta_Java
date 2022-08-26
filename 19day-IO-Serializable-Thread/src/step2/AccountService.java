package step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import common.Path;

public class AccountService  {
	private String filePath = Path.TEST_DIR+"account.obj";
	
	public void executeSerialize(Account account) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(account);
		} finally {
			if(oos != null)
				oos.close();
		}
	}
	public Account executeDeSerialize() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		Account account = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			Object obj = ois.readObject();
				account = (Account)obj;
		} finally {
			if(ois != null)
				ois.close();
		}
		return account;
	}
}
