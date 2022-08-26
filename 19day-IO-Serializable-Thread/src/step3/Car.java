package step3;
import java.io.Serializable;
public class Car implements Serializable {
	private static final long serialVersionUID = -2700646637985939295L;
	private String model;
	private String color;
	public Car() {
	}
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
