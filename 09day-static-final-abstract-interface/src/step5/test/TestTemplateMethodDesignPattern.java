package step5.test;

import step5.common.PizzaService;
import step5.service.PotatoPizzaService;
import step5.service.SeaFoodPizzaService;

public class TestTemplateMethodDesignPattern {
	public static void main(String[] args) {
		/*
		PizzaService pizza1 = new PotatoPizzaService();
		pizza1.makePizza();
		System.out.println("***************");
		PizzaService pizza2 = new SeaFoodPizzaService();
		pizza2.makePizza();
		System.out.println("***************");
		*/
		PizzaService[] array = {
			new PotatoPizzaService(),
			new SeaFoodPizzaService()
		};
		for(PizzaService p : array) {
			p.makePizza();
		}
		System.out.println("*************");
		for(int i = 0; i < array.length; i++) {
				array[i].makePizza(); // 하나의 소통방식으로 다양한 객체들이 각자의 방식으로 동작 
				// 템플릿 메서드 makePizza() 의 사용법만 익히면 다양한 피자들을 만들수 있다 
				System.out.println("****");
		}
	}
}
