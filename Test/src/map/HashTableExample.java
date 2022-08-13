package map;

import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(0, "철수");
		ht.put(1, "영희");
		ht.put(2, "영수");
		ht.replace(2, "수철");
		ht.remove(2);
		for(int i=0; i<ht.size(); i++) {
			System.out.println(ht.get(i)); // Hashtable 값 출력 
		}
		System.out.println("Hashtable 크기 : " + ht.size());
		System.out.println("Hashtable key 확인 : " + ht.contains(2));
		System.out.println("Hashtable value 확인 : " + ht.containsValue("수철"));
		System.out.println("Hashtable 크기 0 인지 확인 : " + ht.isEmpty());
		System.out.println("Hashtable 전체 Key 확인 : " + ht.keySet());
	// HashTable 값 바꾸기 -> replace 
	// HashTable 내용 삭제하기 -> remove
	// 크기 0인지 확인 -> isEmpty();
	// 사이즈 확인하기 -> .size();
	// Key , Value 들었는지 확인하기 -> containsKey(key)
	//													-> containsValue(value)
	// Hashtable 안에 들어있는 전체 Key 확인하기
	// Hashtable.keySet();
		
		
	}
}
