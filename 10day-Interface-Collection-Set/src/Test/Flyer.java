package Test;

public interface Flyer {
	void fly();
	default void fly2() {
	}
	public static void fly3() {
	}
}
