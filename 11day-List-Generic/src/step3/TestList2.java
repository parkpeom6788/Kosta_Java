package step3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class TestList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<>(Arrays.asList(new Friend("김길동",20))); // 뒤에 제너릭 생략가능
		list.add(new Friend("박범",29));
		list.add(new Friend("황희찬",24));
		list.add(new Friend("아이유",31));
		list.add(new Friend("강하늘",36));
		// for loop 를 이용해 리스트의 친구 name 들만 모두 출력하세요
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		System.out.println("**향상된 for문 이용**");
		for(Friend f : list) {
			System.out.println(f.getName()+ " ");
		}
		System.out.println("**Iterator 이용**");
		Iterator<Friend> iterator = list.iterator();
		while(iterator.hasNext()) {
			Friend f = iterator.next();
			System.out.println(f.getName());
		}
		System.out.println("***for loop 를 이용해 30세 이상인 친구 name들만 출력하세요***");
		// for loop 를 이용해 30세 이상인 친구 name들만 출력하세요
		boolean check = false;
		for(int i = 0; i < list.size(); i++ ) {
			if(list.get(i).getAge() >= 30) {
				System.out.println(list.get(i).getName());
				check = true;
			} 
			// 명단에 없으면.. 명단이없습니다 5번출력됨...한번만 출력되게하려면?
		}
		if(check == false) {
			System.out.println("명단에 없습니다");
		}
		System.out.println("*******");
		// 친구 리스트의 이름 나이를 모두 출력하세요
		System.out.println(list.toString()); // toString 재정의한 내용 출력
		System.out.println(list.get(0)); // toString 재정의한 내용 출력
		
		for(int i = 0 ; i< list.size(); i++) {
			System.out.println(list.get(i)); // toString 재정의한 내용 출력
		}
		// 명단에 없을시 한번만 출력
		boolean flag = false;
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getAge() > 40) {
				System.out.println(list.get(i).getAge());
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("명단에 없습니다.");
		}
	}
}
