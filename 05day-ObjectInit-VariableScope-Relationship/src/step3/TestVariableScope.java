package step3;
public class TestVariableScope {
	public static void main(String[] args) {
		VariableScopeExam vs = new VariableScopeExam(); // 1
		System.out.println("**생성자 실행**");
		vs.test1(); // 2 , 0
		System.out.println("**test1() 실행**");
		vs.test2(7); // 0 , 7
		System.out.println("**test2() 실행**");
		vs.test3(8); 
		System.out.println("**test3() 실행**");
	}
}
