package step8;

import java.io.IOException;

// throws : Exception 발생시 호출한 측으로 전파 또는 위임
// throw : Exception을 발생시킬때 사용
class Service {
	public void test1(boolean flag) {
		if(flag) 
			throw new NullPointerException(); // 런타임계열 이셉션( UnChecked Exception)은 별도의 throws 가 필요없다.
		System.out.println("throw test");
	}
	public void test2(boolean flag) throws IOException { // 전파 
		if(flag) // throw : 예외를 발생시킬때 사용하는 키워드 
			throw new IOException(); // 런타임계열을 제외한 모든  체크드 이셉션은 별도의 throws or try~catch 처리가 필요하다
		System.out.println("throw test");
	}
}
public class TestThrow1 {
	public static void main(String[] args) {
		Service service = new Service();
	try { 	
		service.test1(true); // 런타임계열은 하라고 지시가없어서 내가 스스로 try catch함
		} catch(NullPointerException e) {
			System.out.println("test1 예외발생에 대해 처리");
		}
		try {
			service.test2(true); // 체크드이셉션은 try-catch하라고 표시가뜸
		} catch (IOException e) {
			System.out.println("test2 예외발생에 대해 처리");
		} 
		System.out.println("정상 수행");
	}
}
