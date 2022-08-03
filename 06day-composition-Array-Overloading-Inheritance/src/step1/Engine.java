package step1;

public class Engine {
	private String type; // 타입  "하이브리드"
	private int displacement;//배기량  2000
	public Engine() {
	}
	public Engine(String type, int displacement) {
		this.type = type;
		this.displacement = displacement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
}
