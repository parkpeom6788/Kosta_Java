package step7;

//aggregation : has a 관계 고객이 스마트폰을 소유하다
public class TestAggregation {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("장기하");
		// 스마트폰 객체를 생성하여 
		// Customer 에 할당
		System.out.println(c); // customer 객체의 주소값
		System.out.println(c.getSmartPhone());//smartphone 객체 주소값
		c.setSmartPhone(new SmartPhone("갤럭시S22",100));
		// c 객체가 소유한 smartPhone 의 model명을 반환받아 출력
		System.out.println(c.getName());
		System.out.println(c.getSmartPhone().getModel());
		System.out.println(c.getSmartPhone().getPrice());
		// c 객체가 소유한 smartPhone 의 price를 200으로 변경
		c.getSmartPhone().setPrice(200);
		System.out.println(c.getSmartPhone().getPrice()); // 200
	}
}
