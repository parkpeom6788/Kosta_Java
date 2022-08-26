package step5; // step4는 이일을 하기위해 작업을쪼갬
/**
 * 요구사항
 * 파일생성 스레드 : MakeFileWorker Thread 
 * kosta250\iotest\repository 디렉토리에 일정한 간격으로 avi 확장자의 동영상 파일과 
 * mp3 확장자의 음악 파일을 생성한다 ( MakeFileWorker 스레드를 정의해 실행한다 )  MathRandom 
 * ( 1초 간격으로 30번 실행한다 )
 * mp3 와 avi 확장자는 랜덤하게 만들어져야 한다 startend
 * 파일명은 0~29번까지 매번 실행할 때마다 그 범위안에서 순차적으로 이름이 지어져야 한다(loop i)
 * 예 ) 0_1661484144987.avi 또는 0_1661484144987.mp3
 * 		파일명이 중복될 수 있으므로 시간정보를 중간에 삽입한다 
 * 
 * 파일이동 스레드 : MoveFileWorker Thread 
 * 동시에 repository 디렉토리에 생성된 파일을 일정 주기동안 반복하면서 
 * 확장자별로 avi 동영상 파일은 movie 디렉토리로 kosta250\iotest\movie 디렉토리로
 * 						mp3 음악 파일은 kosta250\iotest\music 디렉토리로
 * 분류해서 파일을 이동시킨다 ( renameto 이용) - 7초 간격으로 5번 실행한다 
 * 
 * ----------------------------------------------------------------------------------
 * step1 . 업무파악
 * 파일 생성 스레드
 * step2 . 확장자를 랜덤하게 할당 -> java.util.Random
 * step3 . 파일명에 시간정보를 배당 - System.currentTimeMills();
 * 															SimpleDateFormat 
 * 					파일명이 중복되기 않게 시간정보 할당시켰음
 * step4. 디렉토리와 파일생성
 * 		java.io.file	mkdirs   createNewFile()
 *  				
 * 파일 이동 스레드 
 * step5. 파일 이동 
 * 				java.io.File.renameTo()
 * step6. 디렉토리 내의 파일리스트 정보 -> 확장자별 분류 
 * 				java.io.listFiles() - 파일객체가 넘어옴 - 파일인지 디렉토리인지 구분 가능 
 * @author fight2
 */
public class TestThreadMiniProject {
	public static void main(String[] args) {
		int makeCount = 30; // 파일 생성수 30번 
		int makePeriod = 1000; // 생성 주기 1초간격
		MakeFileWorker makerWorker = new MakeFileWorker(makeCount,makePeriod);
		Thread thread = new Thread(makerWorker);
		thread.start();
		// 스레드 생성 후 start 시킨다
		// 파일생성하고 슬림
		int moveCount = 5;
		int movePeriod = 7000; // 7초간 대기하다가 5번실행
		MoveFileWorker moveFileWorker
		= new MoveFileWorker(moveCount,movePeriod);
		
		Thread thread2 = new Thread(moveFileWorker);
		thread2.start();
	}
}
