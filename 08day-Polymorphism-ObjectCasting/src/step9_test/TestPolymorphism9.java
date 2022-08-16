package step9_test;

import step7.Animal;
import step7.Customer;
import step7.Monkey;
import step7.Tiger;
public class TestPolymorphism9 {
	
	public static void main(String[] args) {
		ZooService2 service = new ZooService2();
		Animal[] array = {
			new Monkey(),
			new Tiger(),
			new Customer()
		};
		service.printInfo(array);
	}
	/*
 	원숭이가 나무타며 놀다
  	호랑이가 사냥하며 놀다
  	고객이 티켓을 구매하다
  	고객이 데이트하며 놀다 
	 */
}
