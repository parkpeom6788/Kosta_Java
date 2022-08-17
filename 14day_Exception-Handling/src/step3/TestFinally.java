package step3;
/*
 *  finally 를 테스트 하기 위한 예제
 *  고의로 예외처리에 실패하고 예외 처리에 실패해도 finally 구문은 언제나 실행한다는 것을 확인하는 예제 
 * => 현금 입출금기에서는 어떤 상황이 벌어져도 입력받은 고객은 반드시 마지막에 되돌려주도록 처리한다 
 * 
 * if else 와 try catch 비슷한데 왜 try 를쓰나 ? exception처리에 예외적인 분기에 처리할수있도록 기술적으로 제공
 * 									throw throws 를 쓰는것이 훨씬 편하고 응집도 높이고 결합도 낮추는데 많은 기여를 한다  
 */
public class TestFinally {
	public static void main(String[] args) {
		String age = "스몰";
		try {
			int iage = Integer.parseInt(age); // 문자열을 정수형으로 변환 , parseInt :  throws NumberFormatException  숫자 포멧이 안맞으면 이셉션
			System.out.println(iage+1); // 정수 변환이 정상적으로 된 후에 후속 작업으로 try 블럭안에 위치 
		} catch(NullPointerException ne) { // NumberFormatException 발생하는 데 다른 예외를 고의로 처리해 본다 -> 처리안됨 
			System.out.println("null 이므로 출력 불가");
		} finally { // 현 위치에 finally를 블럭을 쓰는 것과 안쓰는 것과의 차이  : 어떤 상황에서도 실행이 된다.
						// Exception 발생시 Exception Handling(예외처리)에 실패하더라도 finally 구문은 실행된다.
			System.out.println("finally 영역 : 예외 발생 및 처리여부와 관계없이 항상 실행");
		}
		System.out.println("test");
		System.out.println("정상 수행"); // 정상수행 안나옴 
	}
}
