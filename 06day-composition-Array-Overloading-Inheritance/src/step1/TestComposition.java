
package step1;
public class TestComposition {
	public static void main(String[] args) {
		Car c = new Car("K5","하이브리드",2000);
		System.out.println(c.getModel());
		
		// getEngine 하면 engine 객체 주소값을 통해 Engine객체에 접근하게됨
		System.out.println(c.getEngine().getType()); // 하이브리드
		System.out.println(c.getEngine().getDisplacement()); // 2000
	
		// c가 참조하는 객체의 엔진의 displacement를 2500으로 변경
		// 2000 -> 3000으로 저장 
		c.getEngine().setDisplacement(2500); // Car.getEngine() - engine.setDisplacement(2500)
		System.out.println(c.getEngine().getDisplacement()); // 2500
		
	}
}
