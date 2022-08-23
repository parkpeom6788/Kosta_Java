package step2;

import java.io.File;

public class FileService {
	private String path;
	
	public FileService(String path) {
		this.path = path;
	}
	// path 경로 디렉토리에 있는 fileName에 해당하는
	// 파일을 삭제 , 삭제 여부를 boolean 으로 리턴한다.
	public boolean deleteFile(String fileName) {
		File file = new File(path+File.separator+fileName);
		//File file = new File(path,filename); // 상위디렉터리로 하위디렉터리를 만듬 
		return file.delete();
	}
	/*d이동시킬 디렉터리 생성 
	 * 원본파일 객체 생성 , 이동시킬 객체 생성
	 */
	public boolean moveFile(String fileName, String destDir) { // fileName : memo1.txt
		new File(destDir).mkdirs(); // 이동시킬 디렉토리 생성
		File orgFile = new File(path+File.separator+fileName); // 원본파일 객체 생성
		//System.out.println("orgFile:"+orgFile.isFile());
		// 이동시킬 파일 객체 생성 // orgFile.getName() 대신 fileName도 가능
		
		// 목적지 파일 생성하는 즉시 이동 
		File destFile = new File(destDir+File.separator+orgFile.getName()); // orgFile.getName() 은 memo1.txt 이다.
		return orgFile.renameTo(destFile); // 이동시켰을때만 true
	}
	/*
	 * path ( iotest1 ) 에 해당하는 디렉토리 내의
	 * 모든 파일명과 디렉토리명을 출력하는 메서드
	 * 
	 * path를 이용해 파일 객체 생성
	 * 객체의 메서드 list 호출하면 String 타입 배열 반환 
	 * for loop 를 이용해 출력 
	 */
	public void printDirectoryAndFileInfo() {
		File file = new File(path);
		// 나중에 뮤직플레이어 곡목 출력 
		String[] str = file.list(); // list 는 dir디렉토리 내에 있는 정보를 배열로 반환 
		for(String s : str) {
			System.out.println(s);
		}
	}
	// 파일객체인지 디렉토리 객체인지 알려면 listFiles를 호출하면 File[] 객체 타입으로 반환함
	public void printDirectoryAndFileInfo2() {
		File file = new File(path);
		File[] files = file.listFiles(); // 파일객체의 배열이 반환 ( 가장 많이 씀 )
		for(int i=0; i<files.length; i++) {		
			if(files[i].isDirectory()) {
				System.out.println("directory : " + files[i].getName());
			} else if(files[i].isFile()) {
				System.out.println("file : " + files[i].getName());
			}
		}
	}
}

