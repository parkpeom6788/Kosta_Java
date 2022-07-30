package step4;
// 아래 테스트 케이스에 대응하는 클래스의 setter getter를 tool로 생성해보기 
public class TestSetterGetter2 {
	public static void main(String[] args) {
		KostaMember k = new KostaMember();
		k.setId("starjava");
		System.out.println(k.getId());
		k.setPassword("joy");
		System.out.println(k.getPassword());
	}
}
