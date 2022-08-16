package step7_test;

public class TestAggregation {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		System.out.println(c); // 주소값
		System.out.println(c.getName()); // null
		c.setName("장기하");
		System.out.println(c.getName()); // 장기하
		c.setSmartPhone(new SmartPhone("갤럭시", "S22",100));
		System.out.println(c.getSmartPhone().getName() + c.getSmartPhone().getModel());
		System.out.println(c.getSmartPhone().getPrice()); // 100
		c.getSmartPhone().setPrice(200); // 200으로 변경
		System.out.println(c.getSmartPhone().getPrice()); // 200
	}
}
