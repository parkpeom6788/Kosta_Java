package step8_test;

import java.util.LinkedHashSet;
import java.util.Random;

public class TestRandom {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		Random random = new Random();
		for(int i=1; i<=100; i++) {
			System.out.println(random.nextInt(5)+3); // 3,4,5,6,7 
		}
		
	}
}
