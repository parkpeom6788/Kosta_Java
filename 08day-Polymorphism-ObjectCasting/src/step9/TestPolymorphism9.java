package step9;

import step7.*;
public class TestPolymorphism9 {
	public static void main(String[] args) {
		ZooService2 service = new ZooService2();
		Animal[] array = {
				new Monkey(),
				new Tiger(),
				new Customer()
		};
		service.playAll(array);
		/*
		 	원숭이가 나무타며 놀다
		  	호랑이가 사냥하며 놀다
		  	고객이 티켓을 구매하다
		  	고객이 데이트하며 놀다 
		 */
	}
}
