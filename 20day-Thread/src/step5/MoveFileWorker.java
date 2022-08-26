package step5;

import java.io.File;

public class MoveFileWorker implements Runnable  {
	private int moveCount;
	private int movePeriod;
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}
	@Override
	public void run() {
		try {
			makeDirs();
		for(int i = 0; i < moveCount; i++) {	
			movieFiles();
			Thread.sleep(movePeriod);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	 public void makeDirs(){
		 File musicdir = new File(Path.MUSIC_PATH);
		 if(musicdir.isDirectory() == false) {
			 musicdir.mkdirs();
		 }
		 File moviedir = new File(Path.MOVIE_PATH);
		 if(moviedir.isDirectory() == false) {
			 moviedir.mkdirs();
		 }
	 }
	 public void movieFiles() throws InterruptedException{
		 File files = new File(Path.MAKE_PATH);
		 File[] s = files.listFiles();
		 for(int i=0; i< s.length; i++) {
		if(s[i].isDirectory()) { }
			else if(s[i].isFile()) {
				 if(s[i].getName().endsWith(".avi")) {
					 String ext = ".avi";
					 File movieFile = new File(Path.MUSIC_PATH+File.separator+i+"_"+System.currentTimeMillis()+ext);
					 s[i].renameTo(movieFile);
			 }  else if(s[i].getName().endsWith(".mp3")) {
				 String ext = ".mp3";
				 File musicFile = new File(Path.MOVIE_PATH+File.separator+i+"_"+System.currentTimeMillis()+ext);
				 	s[i].renameTo(musicFile);
			 	}
			 }
		 }
	 }
 }

