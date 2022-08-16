package step3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Long, Food> map = new LinkedHashMap<>();
		Food f = new Food(5L,"새우깡","농심",1100);
		// 키값은 Food 객체의 id로 
		// value는 Food 객체 주소값으로 한다.
		map.put(f.getId() ,  f);
		// 1 id Food 객체를 map 으로 부터 반환받아본다
		System.out.println(map.get(1L));
		Food f2 = new Food(2L,"포테이토칩","빙그레",1100);
		map.put(f2.getId(), f2);
		System.out.println(map); // map 에 toString  -> 나중 JSON 처럼 
		Food f3 = new Food(3,"진라면","오뚜기",1300);
		map.put(f3.getId(), f3);
		System.out.println(map.size()); // 요소의 갯수 
		System.out.println(map.containsKey(3L)); // containsKey() : key가 존재하면 true , 아니면 false
		System.out.println(map.containsKey(7L)); // containsKey() : key가 존재하면 true , 아니면 false
		// key가 2L 인 음식의 name을 출력 
		System.out.println(map.get(2L).getName());
		System.out.println("******map의 key 들만 출력*******");
		Set<Long> set = map.keySet(); // key는 중복이 안되어야 한다. set으로 관리됨 
		Iterator<Long> it = set.iterator(); //(캔따는 방법) 열거할수있는 set 으로 표준화된 방법 iterator를 쓸수있다.
		while(it.hasNext()) {
			System.out.println(it.next()); // 5 , 2 , 3 
		}
		System.out.println("*****map의 value들만 출력*******");
		Collection<Food> col = map.values();
		Iterator it2 = col.iterator(); // Collection 인터페이스도 Iterator사용
		
		while(it2.hasNext()) { // hasNext() 다음 요소가 있으면 true while 구문 내이므로 요소가 있을때 까지 반복 
			System.out.println(it2.next()); // 다음 요소를 반환받음
		}
		
		Set<Entry<Long, Food>> entry = map.entrySet();
		
	}
}
