package step7;
public class ZooService {
	public ZooService() {}
	
	// 나중 DAO 역할	
	public void enter(Animal ani) {
	// ani.play();
	// ani 변수가 Customer 타입 객체인지 확인 
	// Customer 타입이면 독자적 메서드 
	
		if(ani instanceof Tiger) {
			((Tiger)ani).play();
		
		} else if(ani instanceof Monkey) {
			((Monkey)ani).play();
		
		} else if(ani instanceof Customer) {
			((Customer)ani).ticketing();
			((Customer)ani).play();
		}
	}
}
