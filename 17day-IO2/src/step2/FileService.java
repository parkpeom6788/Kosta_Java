package step2;

import java.io.File;

public class FileService {
	private String path;
	
	public FileService(String path) {
	this.path = path;
	}
	// 파일삭제
	public boolean deleteFile(String fileName) {
		File file = new File(path+File.separator+fileName);
		return file.delete();
	}
	// 파일 이동
	public boolean moveFile(String fileName,String destDir) {
		new File(destDir).mkdirs();
		File orgFile = new File(path+File.separator+fileName); // 원본파일
		// 목적지 파일 생성
		File destFile = new File(destDir+File.separator+orgFile.getName()); // 새로운 파일 
		return orgFile.renameTo(destFile); // 이름 이동 
	}
	// 파일 목록 출력 
	public void printDirectoryAndFileInfo() {
		File file = new File(path);
		String[] str = file.list();
		for(String s : str) {
			System.out.println(s);
		}
	}
	/*path( iotest1 ) 에 해당하는 디렉토리 내의
	 * 모든 파일명과 디렉터리명을 출력하는 메서드
	 * 
	 * path를 이용해 파일 객체 생성
	 * 객체의 메서드 list 호출하면 String 타입 배열 반환
	 * for loop 를 이용해 출력한다. 
	 */
	
	// 파일 객체가 디렉토리 객체인지 알려면 listFiles
	public void printDirectoryAndFilesInfo2() {
		File file = new File(path);
		File[] files = file.listFiles(); // 파일 객체의 배열이 반환 ( 가장 많이 쓰인다 )
		for(int i=0; i<files.length; i++) {
			if(files[i].isDirectory()) {
				System.out.print("디렉터리 : " + files[i]);
			} else if(files[i].isFile()) {
				System.out.print("파일 : " + files[i]);
			}
		}
	}
}
