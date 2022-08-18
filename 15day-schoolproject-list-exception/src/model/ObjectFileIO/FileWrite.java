package model.ObjectFileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	File file;
	public FileWrite() {
		file = new File("");
	}
	public void write() {
		 File file = new File("C:/_temp/test.txt");
	        try {
	            FileWriter fw = new FileWriter(file, true);
	       
	            /* 객체 직렬화 해야함.....
	             * 
	             * 
	             */
	            
	            System.out.println("파일에 저장되었습니다.");
	        } catch (IOException e) {
	            e.printStackTrace();
	       }
	  }
}

