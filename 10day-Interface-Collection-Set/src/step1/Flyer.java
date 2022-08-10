package step1;
// 다양한 계층 구조 형성을 통한 다형성 적용을 위한 인터페이스 정의
public interface Flyer {
	String ID="javaking"; // public static final 로 인식 ( static final 상수로 인식 )
	void fly(); // public abstract 추상 메서드로 인식 
	// 아래는 error , 인터페이스는 구현된 메서드를 가질 수 없다
	//void a() {} 
	default void deposit() {
		System.out.println("새롭게 하나 추가된부분에만 추가시키기 위해 default 가 나옴 ");
	}
}

