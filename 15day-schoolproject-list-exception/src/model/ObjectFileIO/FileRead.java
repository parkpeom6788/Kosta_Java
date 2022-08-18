package model.ObjectFileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
	public FileRead() {
	}
	public void read()  {
		   try {
	            FileReader fr = new FileReader("C:/_temp/test.txt");
	            int readCharNo;
	            char[] cbuf = new char[100];
	            while((readCharNo = fr.read(cbuf)) != -1) {
	                String data = new String(cbuf, 0, readCharNo);
	                System.out.print(data);
	            }
	            fr.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
