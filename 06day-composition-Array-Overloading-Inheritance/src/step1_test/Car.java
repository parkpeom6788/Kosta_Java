package step1_test;

public class Car {
	private Engine engine;
	private String model;
	public Car() {}
	public Car(String model) {
		this.model = model;
	}
	public Car(Engine engine, String model) {
		this.engine = engine;
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
