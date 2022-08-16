package step3;

public class VariableScopeExam {
	int i; // instance variable 인스턴스 변수 
	static int j; // class variable 이후 공부예정 -> 클래스 변수 
	// 생성자 ctrl - space 
	public VariableScopeExam() {
//		int i; // local variable : 메서드 내에서 선언 
		int i = 1;
//		System.out.println(i); 에러 지역변수는 반드시 명시적 초기화가 필요하다 
		System.out.println(i);  // 1
	}
	public void test1() {
//		int i; // local variable
//		System.out.println(i);에러  지역변수는 반드시 명시적 초기화가 필요하다
		int i = 2;
		System.out.println(i); // 2 
		System.out.println(this.i); // this를 이용한 인스턴스 변수 출력 
	}
	public void test2(int i) { // 매개변수 parameter 이자 local variable 
		System.out.println(this.i); // 0
		System.out.println(i); // 7 
		int k = 8;
		System.out.println(k); // k는 메모리에서 해제되서 없어져 버린다.
	}
	public void test3(int i) {
		// 위 test2() 에서 선언한 k를 사용할 수 있을까? 없다 지역변수는 지역내에서만 사용 가능 
		//	 System.out.println(k);
		int y = 0;
		if(i>0) {
			int x = 1;
			System.out.println(x);
			y = 1;
		} //  if
		  // 위의 x 지역변수를 사용할 수 있을까 ?  x 
		  //  System.out.println(x); 못함 자신의 선언된 블록 내에서만 사용 가능
	  	  System.out.println(y); // 위에서 초기화 시켜두고 다른블록에서 명시적초기화 해서 다른블록에서 사용 	   
	} // test3
}// class
