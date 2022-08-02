package step8;

public class NoteBook {
	private String model;
	private String color;
	
	public NoteBook(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public NoteBook() {
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
