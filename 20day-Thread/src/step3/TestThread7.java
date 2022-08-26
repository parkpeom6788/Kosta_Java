package step3;
/*
 *  Daemon Thread 처리 : 자신을 생성한 스레드가 종료될 때 함께 종료되는 스레드 
 *  ex) Word 스레드에서 Backup 스레드를 생성하고 start 
 *  		두 스레드가 작업 진행 
 *  		Word 스레드가 종료되면 Backup 스레드도 함께 종료되도록 처리해야 한다 
 *  		=> Backup 스레드를 Daemon 스레드로 처리 setDaemon(true)
 */
public class TestThread7 {
	public static void main(String[] args) {
		Word word = new Word();
		Thread wordThread = new Thread(word);
		wordThread.start();
	}
}
