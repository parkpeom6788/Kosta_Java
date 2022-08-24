package Runnable구현;

public class MySumTest {
	public static void main(String[] args) {
		MySum func = (a , b) -> a + b; // (매개변수) -> 하나의 식;
		System.out.println(func.sum(10, 11));
		
	}
}
