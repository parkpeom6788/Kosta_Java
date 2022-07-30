package step7;

public class TestAccessModifier2 {
	public static void main(String[] args) {
		Airplane a = new Airplane();
		System.out.println(a.company);   // public 모두 접근 가능 
		System.out.println(a.company2); // protected 같은패키지 또는 상속관계
		System.out.println(a.company3); // default 같은 패키지
		// company4는 private이므로 접근 불가
//		System.out.println(a.company4); private 
		System.out.println(a.getCompany4());
		
	}
}
