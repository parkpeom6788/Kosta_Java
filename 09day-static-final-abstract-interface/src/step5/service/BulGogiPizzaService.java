package step5.service;

import step5.common.PizzaService;

public class BulGogiPizzaService extends PizzaService{

	@Override
	protected void topping() {
		System.out.println("불고기 토핑");
	}
}
