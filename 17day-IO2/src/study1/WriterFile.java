package study1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriterFile {
	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		String path = "C:"+File.separator+"Users"+File.separator+"fight"+File.separator+"Desktop"+File.separator
				+"hihi"+File.separator+"momotest";
		
		String content = "이 내용을 메모장 파일에 입력 할 것";
		File file = new File(path);
		file.mkdirs();
		
		File file2 = new File(path+File.separator+"memo.txt"); 
		try {
			file2.createNewFile();
			System.out.println("파일 생성");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter bw2 = null;
		try {
			FileWriter fw = new FileWriter(path+File.separator+"memo.txt",true);
			bw2 = new BufferedWriter(fw);
			Scanner scanner = new Scanner(System.in);
			System.out.println("메모장에 적을 내용 : ");
			String memo = scanner.nextLine();
			bw2.write(memo);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw2 != null)
				try {
					bw2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(path+File.separator+"memo.txt"));
			String message = null;
			while((message=br.readLine()) != null) {
				System.out.println(message);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
