package step2;
import java.util.ArrayList;
public class TestException4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
			list.add("짜장면");
			list.add("탕수육");
			String name = null;
		try {
			System.out.println(name.length());
			System.out.println(list.get(2));
			System.out.println("A");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("B");
			System.out.println(e.getMessage() + "리스트 요소 범위 초과하여 요소를 반납할 수 없습니다 : ex)팝업");
		}catch(Exception e) {
			System.out.println("C");
			e.printStackTrace(); // Exception 발생 경로를 출력한다
		}
		System.out.println("정상수행");
		System.out.println("D");
	}
}
