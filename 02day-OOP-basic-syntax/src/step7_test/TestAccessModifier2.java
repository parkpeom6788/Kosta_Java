package step7_test;

public class TestAccessModifier2 {
	
	public static void main(String[] args) {
		Airplane a = new Airplane();
		System.out.println(a.company); 
		System.out.println(a.company2);
		System.out.println(a.company3);
//		System.out.println(a.company4);  private 클래스내에서만 접근 가능
		
		// getter를 통해 compant4를 출력
		System.out.println(a.getCompany()); 
	}
}
