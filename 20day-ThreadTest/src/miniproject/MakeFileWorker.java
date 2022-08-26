package miniproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class MakeFileWorker implements Runnable {
	File f = null;
	MakeFileWorker(){
		f = new File(Path.PATH_DIR+"repository");
		if(f.isDirectory() == false) {
			f.mkdirs();
		}
	}
	@Override
	public void run() {
		Random random = new Random();
	try {	
		for(int i = 0; i <30; i++) {
			boolean flag = random.nextBoolean();
			Long fileName = random.nextLong();
			if(flag) { // avi		
					PrintWriter pw = new PrintWriter(new FileOutputStream(i+"_"+Path.PATH_DIR+fileName+".avi"));
			} else {  // mp3
					PrintWriter pw = new PrintWriter(new FileOutputStream(i+"_"+Path.PATH_DIR+fileName+".mp3"));
			}		
		}
		//FileNotFoundException
	} catch(FileNotFoundException e) {
		
		}
	}
}
