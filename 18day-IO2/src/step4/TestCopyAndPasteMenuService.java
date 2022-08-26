package step4;

import java.io.IOException;

import common.Path;

public class TestCopyAndPasteMenuService {
	public static void main(String[] args) {
		
		CopyAndPasteMenuService service = new CopyAndPasteMenuService();
		String orgFilePath = Path.TEST_DIR+"menu.txt";
		String destFilePath = Path.DEST_DIR+"menu.txt";
		
		
	try {
		service.execute(orgFilePath,destFilePath);
		System.out.println("메뉴 copy and paste 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
