package map;

import java.util.HashMap;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("Key", "Value");
		map.put("jayden", "https: jayden-lee.github.io");
		
		// 객체 검색 
		boolean isEmpty = map.isEmpty();
		int size = map.size();
		String value = map.get("jayden");
		// key를 Set 컬렉션에 담아서 반환
		Set<String> keySet = map.keySet();
		
		// 객체 삭제
		map.clear();
		map.remove("jayden");
		
	}
}
