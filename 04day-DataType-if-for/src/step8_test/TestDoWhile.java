package step8_test;

public class TestDoWhile {
	public static void main(String[] args) {
		// do ~ while 반드시 한번은 실행
		int i = -11;
		// i = 1;  새로운 값 할당
		do { // 한번은 입력은 받고 조건 비교할때 do~while문이 쓰인다. 
			System.out.println("do i : " + i);
			i++;
		} while(i<0);
	}
}
