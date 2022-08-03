package step1;

// composition
public class Car {
	private String model;
	private Engine engine; // composition consist of
	
	public Car(String model,String type,int displacement) {
		this.model = model;
		// Car 객체 생성시 반드시 Engine 객체를 선행해서 생성하게 강제한다
		// 아래와 같이 명시함으로써 Car 객체 생성 이전에 Engine 부터 생성하게 된다.
		this.engine = new Engine(type,displacement);
		// 힙영역에 엔진부터 만들어지고 car카 만들어짐 
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	// getEngine 리턴 타입은 engine 
	public Engine getEngine() {
		return engine;
	}
	// setEngine 매개타입은 engine 변수 
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
