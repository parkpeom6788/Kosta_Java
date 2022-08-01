package step3;
/*
  		&& 연산과 || 연산 ( && 연산은 모두가 참일때 참 , || 연산은 모두가 거짓일때 거짓)
  		1. and ( && ) 연산 : 모든 조건식이 참일때만 true 
  		true  &&  true => true 모두가 참일때만 참 
  		true &&  false => false   
  		false && true => false  -> 앞에꺼 false가 나오면 뒤에꺼 볼 필요가 없다 
  		false && false => false 
  		
  		2. or ( || ) 연산 : 조건식 중에 참이 하나 이상 나오면 true 
  		true || true => true  -> 앞에꺼 true 가 나오면 뒤에꺼 볼 필요가없다. 
  		true || false => true
  		false || true => true
  		false || false => false 
 */
public class TestOperator2 {
	public static void main(String[] args) {
		OperatorExam exam = new OperatorExam();
		// & 와 && 연산자의 차이점 확인
		// &연산은 모든 조건식 시랭하고 결과를 도출함
		System.out.println("main : "+ (exam.test1() & exam.test2()));
		// &은 앞에것이 false 여도 뒤에 것도 검사함
		System.out.println("실행과정을 비교해 본다.");
		System.out.println("main : "+ (exam.test1() && exam.test2()));
		// &&은 앞에것이 false 이면 뒤에 것은 검사안함 
		
		// 즉,  & 보다 &&가 실행결과가 더 빠름  (불필요한 연산을 하지 않는다)
		/*
		 *  && 연산은 false 가 나오면 결과가 확정되므로 
		 *  이후 불필요한 test2 메서드 실행하지 않고 바로 결과를 도출한다.
		 *  마찬가지로 || 연산일 경우 true 가 나오면 이후 조건식 실행없이 
		 *  바로 true 결과를 도출한다 
		 */
		
	}
}











