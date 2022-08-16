package step8;
/*
 *  java.util.Random class를 임의의 정수를 발생시켜보는 예제
 */
import java.util.LinkedHashSet;
import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		Random random = new Random();
		
		for(int i=1; i<=6; i++) {
			System.out.println(random.nextInt(3)); // bound 범위를 3으로 주면 0~2 까지 랜덤한 정수를 반환	
		}
	}
}
