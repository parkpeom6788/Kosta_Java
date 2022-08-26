package step3;

import java.io.Serializable;
public class Car implements Serializable {
	private static final long serialVersionUID = -6722068538392578525L;
	private String model;
	private String color;
	public Car() {
	}
	public Car(String model, String color) {
		super();
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
}
