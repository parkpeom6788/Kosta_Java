package step3;

import java.util.TreeMap;
public class TestMap1 {
	public static void main(String[] args) {
		// TreeMap : key value 로 저장 , 정렬 기능 
		TreeMap<Integer,String> map = new TreeMap(); // TreeMap 도 정렬기능 보장
		map.put(3, "테라");
		map.put(5, "카스");
		map.put(1, "참이슬");
		System.out.println(map);  // key를 기준으로 정렬된다.
		System.out.println(map.get(3)); // key로  value를 검색 
		// 동일한 key로 value를 put 해본다 
		map.put(1, "처음처럼"); // 해당 key에 대한 value가 업데이트 된다
		System.out.println(map); // 참이슬-> 처음처럼 으로 수정  
		System.out.println("삭제 : " + map.remove(5));
		System.out.println(map); // 카스 삭제 
		System.out.println(map.size()); // 2
	}
}
