package step8_test;

/* 상속을 받았어도
 * 부모의 private member(속성,기능) 에는
 * 클래스가 다르므로 접근 불가
 * 접근 하기 위해서는 getter / setter 를 이용함
 */
public class TestInheritance2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.play();
		
		Parent p = new Parent();
		Parent p2 = new Child();
		
		
	}
}
