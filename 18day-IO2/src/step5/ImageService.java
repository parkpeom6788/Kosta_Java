package step5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {

	public void execute(String orgFilePath, String destDirPath) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int message = 0;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(orgFilePath));
			bos = new BufferedOutputStream(new FileOutputStream(destDirPath));
			while((message = bis.read()) != -1) {
				bos.write(message);
			 }
			message = bis.read();
			while(message != -1) {
				bos.write(message);
				message = bis.read();
			}
		} finally {
			if(bis != null) 
				bis.close();
			if(bos != null)
				bos.close();
		}
	}
} 
