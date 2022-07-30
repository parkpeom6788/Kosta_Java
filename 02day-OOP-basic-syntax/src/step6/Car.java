package step6;

// 접근 제어자 테스트 
public class Car {
	// public : 다른 패키지에서 접근 가능 , 어디서나 접근 가능
	public String model="k5";
	
	protected String model2 = "k5"; // 동일한 패키지
	String model3 = "k5"; // default 동일한 패키지
//	private String model4 = "k5";
}
