package step4_test;

public class TestIf1 {
	public static void main(String[] args) {
		int age = 20;
		if(age < 19) {
			System.out.println(age + "세 미성년");
		} else { // 20세 이면 이것이 실행됨 
			System.out.println(age + "세 성인");
		}
	}
}
