package step2;
/*
 * local variable 정보를 저장하는 statck 은 스레드별로 별도 생성되어 관리
 * instance variable 정보(객체 정보)를 저장하는 heap은 하나 존재하여
 * 여러 스레드에 의해 공유될 수 있다 는 것을 확인 하는 예제
 */
public class TestThread9 {
	public static void main(String[] args) {
		System.out.println("main thread 실행");
		SearchWorker worker = new SearchWorker();
		new Thread(worker,"첫번째 검색일꾼스레드").start();
		new Thread(worker,"두번째 검색일꾼스레드").start();
		new Thread(worker,"세번째 검색일꾼스레드").start();
		System.out.println("main thread 종료");
	}
}
