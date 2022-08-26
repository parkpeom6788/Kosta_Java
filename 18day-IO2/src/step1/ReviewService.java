package step1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import common.Path;

public class ReviewService {
	private String filePath = Path.TEST_DIR + "message.txt";

	public void readMessage() throws IOException {
		// BufferedReader > FileReader br.readLine() => 한라인씩 입력, 더 입력 받을 내용이 없으면 null
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
			String message = null;
			while ((message = br.readLine()) != null) {
				System.out.println(message);
			}
		} finally {
			if (br != null)
				br.close();
		}
	}

	public void readMessage2() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
			while (br.ready()) { // br.ready() 반환 -> boolean 값이 있는동안 반복
				System.out.println(br.readLine());
			}
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public void writeMessage(String message) throws IOException {
		PrintWriter pw = null; // 메모장에 출력
		try {
			pw = new PrintWriter(new FileWriter(filePath, true)); // true 이어서 글쓰기 
			pw.println(message); // 또는 pw.write(message+"\n");

		} finally {
			if (pw != null)
				pw.close();
		}
	}
}
