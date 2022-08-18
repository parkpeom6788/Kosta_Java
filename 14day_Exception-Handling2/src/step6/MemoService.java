package step6;

import java.io.FileReader;
import java.io.IOException;

public class MemoService {
	
	
	public String readMemo(String fileName) throws IOException  {
		
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			System.out.println("A");
		}
		finally {
			if(fr!=null) 
				fr.close();
			System.out.println("D");
		}
		return fileName + "에서 기록된 정보";
	}
}
