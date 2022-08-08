package step5.service;

import step5.common.PizzaService;

public class PotatoPizzaService extends PizzaService {
	@Override
	protected void topping() {
		System.out.println("감자 토핑");
	}
	
}
