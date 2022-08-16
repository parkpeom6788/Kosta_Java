package step9_test;

import step7.Animal;
import step7.Customer;

public class ZooService2 {
	public void printInfo(Animal[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] instanceof Customer) {
				((Customer)array[i]).ticketing();
			}
			array[i].play();
		}
	}
}
