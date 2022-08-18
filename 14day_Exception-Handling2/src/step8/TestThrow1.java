package step8;

import java.io.IOException;

// throws : Exception 발생시 호출한 측으로 전파 또는 위임
// throw : Exception을 발생시킬때 사용
class Service {
	public void test1(boolean flag) {
		if(flag) 
			throw new NullPointerException(); 
		System.out.println("throw test");
	}
	
	public void test2(boolean flag) throws IOException {
		if(flag)
			throw new IOException();
		System.out.println("throw test");
	}
}
public class TestThrow1 {
	public static void main(String[] args) {
		Service service = new Service();
		
		try {
			service.test1(true);
		}catch(NullPointerException e) {
			System.out.println("test1 예외발생에 대해 처리");
		}
		
		try {
			service.test2(true);
		}catch(IOException e) {
			System.out.println("test2 예외발생에 대해 처리");
		}
		System.out.println("정상 수행");
	}
}