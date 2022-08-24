package study1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			List<String> tokens = new ArrayList<>();
			Scanner lineScanner = new Scanner(scanner.nextLine());
	
			while(lineScanner.hasNext()) {
				tokens.add(lineScanner.next());
			}
			lineScanner.close();
			System.out.println(tokens);
		}
		scanner.close();
	}
}
