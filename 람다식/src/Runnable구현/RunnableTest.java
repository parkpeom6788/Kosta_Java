package Runnable구현;

import java.util.ArrayList;
import java.util.List;

public class RunnableTest {
	public static void main(String[] args) {
		
		// Runnable 인터페이스를 구현한 클래스가 필요할때
		// 간단하게 run() 메서드만 구현하면 되기 때문에 대부분의 코드에서
		// 익명객체를 이용해 구현한다.
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Start Thread");
				try {
					Thread.sleep(1000);
					System.out.println("End Thread");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(()->{
			System.out.println("Start Thread");
			try {
				Thread.sleep(1000);
				System.out.println("End Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		// 람다를 이용한 컬렉션 순회
		/*
		 * 람다를 이용해서 짧게 작성할 수 있는 코드 중에 가장 흔한 종류가
		 *컬렉션과 같이 사용 하는 경우다 List<> 인터페이스에 추가된 forEach()
		 *메서드를 이용하면 리스트 컬렉션에 들어있는 각 엘리먼트들의 내용을
		 *입력받은 람다식을 수행할 수 있다
		 */
		List<String> list = new ArrayList<>();
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.forEach(x -> System.out.println(x));
		
	}
}
