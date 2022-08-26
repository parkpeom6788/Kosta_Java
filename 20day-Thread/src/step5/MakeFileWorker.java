package step5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class MakeFileWorker implements Runnable {

	private int makeCount;
	private int makePeriod;
	public MakeFileWorker(int makeCount, int makePeriod) {
		this.makeCount = makeCount; // 반복할때
		this.makePeriod = makePeriod; // sleep 할때
	}
	@Override
	public void run() { 
		try {
			makeDir();
			makeFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 3가지 디렉터리를 일괄적으로 만듬
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void makeDir() throws InterruptedException{
		File makedir = new File(Path.MAKE_PATH);
		if(makedir.isDirectory() == false) {
			makedir.mkdirs(); 
		}
	} 
	public void makeFile() throws IOException, InterruptedException{
		String ext = "";
		Random random = new Random();
	for(int i=0; i<makeCount; i++) { // 0 ~ 29
		Thread.sleep(makePeriod);
		if(random.nextBoolean()) {   // avi 
			ext = ".mp3";
			File f = new File(Path.MAKE_PATH+File.separator+i+"_"+System.currentTimeMillis()+ext);
				f.createNewFile();
		} else { //mp3
			ext = ".avi";
			File f = new File(Path.MAKE_PATH+File.separator+i+"_"+System.currentTimeMillis()+ext);
				f.createNewFile();
			}
		}
	}
}
