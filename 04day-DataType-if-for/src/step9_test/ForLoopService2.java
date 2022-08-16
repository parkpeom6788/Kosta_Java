package step9_test;

public class ForLoopService2 {
	
	public ForLoopService2() {

	}
	public void printInfo(String item , int count, int limit) {
		for(int i = 1; i <= count; i++) {
			System.out.print(item +  i + "잔");
			if(i == limit) {
				break;
			}
		}
	}
}
