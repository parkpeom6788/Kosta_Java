package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import common.Path;
public class Test {
	String TEST_DIR="C:"+File.separator+"kosta250"+File.separator+"iotest"+File.separator+"menu.txt"; 
	public static void main(String[] args) {
		String originalpath = Path.TEST_DIR+File.separator+"menu.txt";	 // 원본 
		String movepath  = "C:"+File.separator+"kosta250"+File.separator+"iotest3"+File.separator+"menu.txt";	 // 복사할곳 
		String memo = null;
		BufferedReader br = null;
		PrintWriter pw = null;
	try {
			br = new BufferedReader(new FileReader(originalpath));
			pw = new PrintWriter(new FileWriter(movepath));
			while((memo = br.readLine()) != null) {
				pw.write(memo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(pw != null)
				pw.close();
		}
	}
}
