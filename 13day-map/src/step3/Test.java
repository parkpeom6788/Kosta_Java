package step3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class Test {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		
		Collection<String> map2 = map.values();
		System.out.println(map2);
	}
}
