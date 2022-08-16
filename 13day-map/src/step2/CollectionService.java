package step2;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionService {
	public Collection<String> findCollection(String type) {
		Collection<String> data = null;
		// type이 A이면 LinkedHashSet 
		if(type.equals("A")) {
			data = new LinkedHashSet<>();
			data.add("아이유");
			data.add("손석구");
		} else if(type.equals("B")) {
		// type이 B이면 ArrayList를 반환
			data = new LinkedList<String>();
			data.add("오이");
			data.add("당근");
			data.add("깻잎");
		}
		return data;
	}
}
