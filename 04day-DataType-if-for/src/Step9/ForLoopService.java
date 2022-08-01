package Step9;

public class ForLoopService {
	public ForLoopService() {	}
	public void printInfo(String item,int count) {
		// for loop
		// 1부터 시작해서 count 이하일 동안 반복 
		for(int i = 1; i<=count;i++) {
			System.out.println(item+i+"잔");
		}
	}
}
