package step2;

// service는 비즈니스 업무 를 정의하는 곳
// 상위 인터페이스 Flyer 타입의 매개변수로 다양한 하위 객체를 처리 
public class FlyerService {
	public void execute(Flyer flyer) {
		flyer.fly();
	}
}
