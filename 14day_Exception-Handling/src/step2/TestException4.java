package step2;
import java.util.ArrayList;
public class TestException4 {
	public static void main(String[] args) {
		// TestException3에서는 IndexOutOfBoundsException 을 고의로 발생시켜 비정상 종료되는 예제
		// TestException4 에서 Exception Handling( 예외 처리 )
		ArrayList<String> list = new ArrayList<>(); 
			list.add("짜장면");
			list.add("탕수육"); 
			String name = null;
		try { // 한줄일수도있고 여러줄일수도 있다  - 작업 단위로묶어야함 - try 로 잡는 부분이 업무단위(트랜잭션) 
								//								카드입력->비번입력->출금선택-> 출금 시 입력 -> 카드 회수시 (finally) 항상실행하도록 한다.  
													// finall를 안써도되지않나 ? 예외처리가 발생하면 밑에가 실행이 안됨
			System.out.println(name.length()); // 발생즉시 catch 문으로 , catch문에 예외처리안하면 프로그램 바로 종료  
			System.out.println(list.get(2)); 
			System.out.println("A");
		}catch (IndexOutOfBoundsException e) { // 구체적인 타입으로 처리하면 해당 Exception에 대한 상세한 대처가 가능 
			System.out.println("B");
			System.out.println(e.getMessage() + " 리스트 요소 범위 초과하여 요소를 반납할 수 없습니다 : ex)팝업");
		} catch(Exception e) { // 부모타입 Exception 으로 자식 Exception들을 처리할 수 있음 
			System.out.println("C");
			e.printStackTrace(); // Exception 발생 경로를 출력한다 
		} 
		System.out.println("정상수행");
		System.out.println("D");
	}
}
