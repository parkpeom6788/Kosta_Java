package step2_test;

public class TestEncapsulation2 {
	
	public static void main(String[] args) {
		
		MyDate m = new MyDate();
		// day는 1~31까지만 할당해야 하나
		// 아래와 같이 잘못된 값이 할당 가능하다
		m.day = 33;
		
		// private 이므로 접근 자체가 불가
//		m.capsulationDay =  33;  private 접근 불가 값 할당 못함 이럴때 getter/setter 사용
		System.out.println(m.getCapsulationDay());
		
		m.setCapsulationDay(33); // set 검증에서 걸러짐 
		System.out.println(m.getCapsulationDay());
	}
}
