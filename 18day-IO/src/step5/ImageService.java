package step5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	public void execute(String orgFilePath, String destDirPath) throws IOException {
		File destDir = new File(destDirPath);
		if(destDir.isDirectory()==false)  // 폴더가 존재하지 않으면
			destDir.mkdirs();
		File orgFile = new File(orgFilePath);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(orgFile));
			bos = new BufferedOutputStream(new FileOutputStream(destDirPath+orgFile.getName())); // 목적지디렉토리 + 파일명
			int data = bis.read(); // 0 ~ 255 까지의 byte 정보를 반환 , EOF(End Of File) 는 파일의 끝이면 -1 반환 
			while(data!=-1) { // -1이 아닐동안 계속 반복 
				 bos.write(data);
				 data=bis.read();
			  }
		} finally {
			if(bis!=null)
				bis.close();
			if(bos!=null)
				bos.close();
			}//finally
		} // method
	} // class
