package study1;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		while(scanner.hasNextLine()) {
			String[] tokens = scanner.nextLine().split("\\s"); // \\s 스페이스 공백 을 기준으로 나뉘어서 배열에 저장 
			System.out.println(Arrays.toString(tokens));
		}
	scanner.close();	
	}
}
