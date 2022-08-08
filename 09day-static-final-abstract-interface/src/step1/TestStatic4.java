package step1;

// TestStatic4 <- static 이해하기 가장 좋은 예제
public class TestStatic4 {
	public static void main(String[] args) {
		Fish f1 = new Fish();
		System.out.println(f1.count); //1
		System.out.println("sCount  : " + Fish.sCount); // 1
		Fish f2 = new Fish();
		System.out.println(f2.count); //1
		System.out.println("sCount  : " + Fish.sCount); // 2
		Fish f3 = new Fish();
		System.out.println(f3.count);// 1
		System.out.println("sCount  : "  + Fish.sCount); // 3 
		/* count 
		 * 1 1 1 이 나오는 이유는
		 * 객체 생성시 heap 영역에 별도의 세개 객체 공간이 생성되고
		 * count 가 초기화 되어 0 -> 1 까지만 저장되어 있다
		 */
		/*
		 * sCount 1 2 3 이 나오는 이유는
		 * class loading 시에 한번 하나의 공간 meta space 에 
		 * sCount 영역이 잡히는 
		 */
	}
}
