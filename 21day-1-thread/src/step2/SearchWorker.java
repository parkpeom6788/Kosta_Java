package step2;

public class SearchWorker implements Runnable {
	// 여러 스레드에 의해 공유될 수 있는 heap 영역에 저장되는 정보 
	private String info="heap 영역에 저장된 정보";
	private int count; // 인스턴스 변수이므로 0 으로 초기화 -> 각각의 스택마다 공유해서 계속 ++ 됨 
					// 하지만 공유해서 사용하면 .... 문제발생  예) 화장실 하나에 사람이 공유할때..
					// 화장실 사용은 순차적으로  멀티x단일스레드 환경으로 순차적으로 입장시키게함
	// 멀티스레드 : 임계영역 에서는 멀티스레드가 되면 안되는 영역이 생김 그환경을 단일스레드 환경으로 만듬
	//		-> synchronized 동기화 ( 특정 영역을 단일스레드 환경 ) ex) 영화 예매 , 데이터컨넥션 풀  
	
	@Override
	public void run() {
		searchService();
	}
	public void searchService() {
		// 지역변수 : i는 별도의 stack 에서 각각 저장되므로 자신만의 누적값이 출력된다 
		// 인스턴스 변수 : 하나의 heap 에 저장되어 여러 스레드에서 
		// 공유하여 사용할 수 있다 
		// count 인스턴스 변수는 여러 스레드에 의해 공유되므로 스레드 별이 아니라
		// 실행 횟수만큼 누적되어 출력된다  ->  한달에 한번해야할 작업 
		String threadName = Thread.currentThread().getName();
		for(int i=0; i<5; i++) {
			System.out.println(threadName + "지역변수 " + i + "인스턴스 변수" + info +" " + count++); 
		}
	}
}
