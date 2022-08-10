package step1_test;

public interface Flyer {
	String ID = "javaking";
	void fly();
	
	default void deposit() {
		System.out.println("새롭게 하나 추가된 부분에만 추가 시키기 위해 default 가 나옴");
	}
}
