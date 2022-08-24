package step1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import common.Path;
public class ReviewService {
	private String filePath = Path.TEST_DIR + "message.txt";
	// filePath 에 메세지를 출력
	public void writeMessage(String message) throws IOException {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filePath,true));
			pw.write(message + "\n");
		} finally {
			if(pw != null)
			pw.close();
		}
	}
	public void readMessage() throws IOException {
		/*
		 * BufferedReader > FileReader 
		 * br.readLine() => 한라인씩 입력 , 더 입력 받을 내용이 없으면 null
		 */
		BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader(filePath));
		String message = null;
	while((message = br.readLine()) != null) {
			System.out.println(message);
		}
	} finally {
		if(br != null) 
			br.close();
		}
	}
	public void readMessage2() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
			while(br.ready()) { // br.ready() 반환 boolean
				System.out.println(br.readLine());
			  }
		} finally {
			if(br != null)
				br.close();
		}
	}
}
