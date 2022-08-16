package step1;

public class Fish {
	int count; 
	static int sCount;
	public Fish() {
		//System.out.println("Fish 객체 생성");
		count++; // 0 -> 1
		sCount++; // 0 -> 1 -> 2 -> 3...
	}
}
