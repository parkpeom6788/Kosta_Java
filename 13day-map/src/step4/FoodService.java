package step4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

import step3.Food;

public class FoodService {

	private LinkedHashMap<Long, Food> map = new LinkedHashMap<>();

	public FoodService() {

	}
	public void addFood(Food food) {
		// key : id , value : Food Object
		map.put(food.getId(), food);
	}
	public void printAll() {
		//  map.values() -> Collection 의 iterator() 메서드 사용 
		Iterator<Food> it = map.values().iterator();
		while(it.hasNext()) {
			Food  food = it.next();
			System.out.println(food);
		}
	}
	public Food findById(long id) {
		return map.get(id);
	}
}
