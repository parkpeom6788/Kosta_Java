package step5;
/*
 * main thread 즉 단일 스레드 환경에서 실행 결과를 확인 , step6의 멀티 스레드와 비교해 본다
 */
class VideoWorker {
	public void video() {
		for(int i=0; i<10; i++) 
		System.out.println("영상을 제공하다");
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 스레드 시작");
		VideoWorker worker = new VideoWorker();
		worker.video(); // 단일스레드 하나 순차적으로 혼자서함 단점 : 다른손님이 오면 기다려야함 
		System.out.println(Thread.currentThread().getName()+" 스레드 종료");
		
	}
}
