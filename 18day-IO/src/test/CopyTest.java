package test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class CopyTest {
	// 원본 
	public StringBuilder readFile(String originalpath) throws IOException {
		String memo = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			br = new BufferedReader(new FileReader(originalpath));
			while((memo = br.readLine()) != null) {
				sb.append(memo+"\n");
			  }
		} finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return sb;
	}
	// 복사되는 곳 
	public void writeFile(String movepath, Object memo) throws IOException {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(movepath));
			if(memo instanceof StringBuilder) {
				pw.println(memo);
			}
		} finally {
			if(pw != null) 
				pw.close();
		}
	}
}
