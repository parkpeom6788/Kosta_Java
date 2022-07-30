package step4_test;

public class TestSetterGetter2 {
	
	public static void main(String[] args) {
		
		KostaMember k = new KostaMember();
		
		k.setId("starJava");
		System.out.println(k.getId());
		
		k.setPassword("joy");
		System.out.println(k.getPassword());
	}
}
