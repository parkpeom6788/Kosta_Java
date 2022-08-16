package step4_test;

public class TestObjectInitAndVariableScope {
	
	public static void main(String[] args) {
		
	Friend f = new Friend("아이유",30);
	FriendService service = new FriendService();
	System.out.println(f.getName());
	System.out.println(f.getAge());
	System.out.println("***test1***");
	
	System.out.println("************");
	service.test2(f);
	
	System.out.println(f.getName());
	System.out.println(f.getAge());
	System.out.println("***test2***");
	}
}
