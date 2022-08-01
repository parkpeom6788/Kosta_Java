package step8;
public class TestDoWhile {
	public static void main(String[] args) {
		// do ~ while 반드시 한번은 실행
		int i = -11;
		// i = 1; 새로운값 할당
		do { // 무조건 한번은 실행 , do while 구문은 반드시 do구문은 한번 실행되는 구조다 
			// ex) 한번은 입력은 받고 조건비교 할때 
			System.out.println("do i : " + i); 
			i++;
		}while(i<0); 
	}
}
