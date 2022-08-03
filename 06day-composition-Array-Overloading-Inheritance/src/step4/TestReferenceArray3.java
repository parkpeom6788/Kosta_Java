package step4;

import java.util.Scanner;

public class TestReferenceArray3 {
	public static void main(String[] args) {
		
		Item[] items = {
				new Item("진라면","오뚜기",1000),
				new Item("비빔면","팔도",1200),
				new Item("짜파게티","농심",800),
		};
		
		// 정보를 전달함 
		ItemService service = new ItemService(items); // 아이템을 관리함
		service.printNameAll();
		service.printPriceAll();
	
		// 라면 검색하여 가격 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("라면 이름 : ");
		service.infoItem(sc.nextLine());
		
		// 가격의 오름차순으로 정렬
		service.orderPrice();
	}
}
