package miniproject;

public class TestThreadMiniProject {
	public static void main(String[] args) {
		MakeFileWorker mt = new MakeFileWorker();
		Thread mkThread = new Thread(mt);
		mkThread.start();		
	}
}
