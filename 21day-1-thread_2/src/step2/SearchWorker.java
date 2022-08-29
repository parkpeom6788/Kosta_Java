package step2;

public class SearchWorker implements Runnable {
	private String info = "heap 영역에 저장된 정보";
	private int count; // 인스턴스 변수 공유 
	@Override
	public void run() {
		searchService();
	}
	private void searchService() {
		String threadName = Thread.currentThread().getName();
		for(int i=0; i<5; i++) {
			System.out.println(threadName + "지역변수" + i + "인스턴스 변수"
					+ info + " " + count++);
		}
	}
}
