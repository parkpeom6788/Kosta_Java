package step4;

public class TestIf1 {
	public static void main(String[] args) {
			int age = 20;
			if(age < 19)  { // 실행문이 한라인일 경우 중괄호 생략 가능 
				System.out.println(age + "세 미성년");
		    } else { 
				System.out.println(age + "세 성인");
		    }
		}
	}
