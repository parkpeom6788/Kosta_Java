package Step9;
public class ForLoopService2 {
	public ForLoopService2() {}
	public void printInfo(String item,int count,int limit) {
		for(int i = 1; i <= count; i++) {
			System.out.println(item+i+"잔");
			if(i == limit) {
				break;
			}// if
		} // for 
	} // method
} // class
