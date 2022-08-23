package step1;
import java.io.File;
import java.io.IOException;
public class TestFile1 {
	public static void main(String[] args) {
		String path ="C:"+File.separator+"kosta250"+File.separator+"iotest1"; // 운영체제에 맞게끔 구분자 \    C:\kosta250\iotest1 -> 플랫폼에 독립적이다 
		File dir1 = new File(path);
		System.out.println(dir1.exists()); // 존재유무 
		System.out.println("디렉토리 생성:"+dir1.mkdirs()); // mkdirs 하위 디렉터까지 한꺼번에 만듬 , mkdir :     false :있으니까 안만들어짐 
		System.out.println("존재유무 : " + dir1.exists()); // 존재유무 
		
		// dir1 파일객체의 경로 ( iotest1 ) 디렉토리 아래에 memo1.txt 파일을 생성해본다
		System.out.println("dir1의 경로:"+dir1.getPath()); 
		
		File file1 = new File(dir1.getPath()+File.separator+"memo1.txt"); // 정상흐름 테스트
		// 예외흐름 테스트( 존재하지 않는 경로를 입력해 예외를 발생시켜본다 )
		//	File file1 = new File("H:"+File.separator+"memo1.txt"); 
		try {
			boolean result = file1.createNewFile(); // checked 이셉션 
			System.out.println(file1.getPath()+" 파일생성:"+result); // C:\kosta250\iotest1\memo1.txt 파일생성:true
		} catch (IOException e) {
			e.printStackTrace(); // 예외경로 + 예외메시지
		}
	}
}
