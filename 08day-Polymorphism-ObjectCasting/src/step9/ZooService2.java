package step9;

import step7.Animal;
import step7.Customer;

public class ZooService2 {
	public void playAll(Animal[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] instanceof Customer) {
					((Customer)array[i]).ticketing();
			}
			array[i].play();
		}
	}
}
