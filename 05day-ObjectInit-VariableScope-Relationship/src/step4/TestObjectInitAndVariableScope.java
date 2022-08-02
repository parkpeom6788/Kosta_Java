package step4;
/*
 * 객체 초기화 단계 및 변수 범위와 메모리 적재 흐름에 대한 예제
 * 실행 결과를 예상해 봅니다   
 */
public class TestObjectInitAndVariableScope {
	
	public static void main(String[] args) {
		Friend f = new Friend("아이유",30);
		FriendService service = new FriendService();
		
		f = service.test1(f);
		System.out.println(f.getName()); // 아이유
		System.out.println(f.getAge()); // 30 
		System.out.println("***test1***");
		
		System.out.println("***********");
		service.test2(f);
		System.out.println(f.getName()); // 황의조
		System.out.println(f.getAge()); // 30 
		System.out.println("***test2***");
	}
}
