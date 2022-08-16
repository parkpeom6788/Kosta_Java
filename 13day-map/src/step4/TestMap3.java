package step4;

import step3.Food;

public class TestMap3 {
	public static void main(String[] args) {
		// FoodService의 인스턴스 변수는 LinkedHashMap이 존재하고 명시적 초기화 한다
		FoodService service = new FoodService();
		service.addFood(new Food(5,"새우깡","농심",1100));
		service.addFood(new Food(7,"감자깡","농심",1200));
		service.addFood(new Food(2,"맛동산","오뚜기",1800));
		service.addFood(new Food(2,"맛동산","오뚜기",1800));
		
		service.printAll();
		Food food = service.findById(7L);
		System.out.println(food);
		Food food2 = service.findById(8L);
		System.out.println(food2);
		/*
		 *   value들만 입력 순서대로 한 라인씩 음식 상세 정보가 출력된다. (toString)
		 */
	}
}
