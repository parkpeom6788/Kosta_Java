package step5.service;

import step5.common.PizzaService;

public class SeaFoodPizzaService extends PizzaService {
	@Override
	protected void topping() {
		System.out.println("해산물 토핑");
	}
}
