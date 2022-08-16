package step9_test;

public class ForLoopService {
	
	public ForLoopService() {

	}
	
	public void printInfo(String item , int count) {
		
		for(int i = 1; i <= count; i++) {
			System.out.println(item + i + "잔 ");
		}
	}
	
}
