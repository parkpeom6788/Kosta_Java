package step2;

import java.util.Collection;
import java.util.Iterator;
public class TestIterator2 {
	public static void main(String[] args) {
		CollectionService service = new CollectionService();
		String type="B";
		//type="B";
		Collection<String> data = service.findCollection(type);
		// service의 findCollection 메서드를 호출하면 
		// 다양한 컬렉션 인터페이스 계열의 구현 객체
		// (LinkedHashSet , LinkedList 등 .. ) 가
		// 반환된다.
		// 이러한 자료 구조체들을 단일한 방식으로 
		// 요소들을 반복 , 열거할 수 있다. 
		// 표준화된 방식으로 열수있다.
		Iterator<String> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
