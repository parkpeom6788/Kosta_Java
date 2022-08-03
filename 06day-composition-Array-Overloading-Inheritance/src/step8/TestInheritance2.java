package step8;
/*
 *	상속을 받았어도 
 * 부모의 private member(속성,기능) 에는
 * 클래스가 다르므로 접근 불가 
 * 접근 위해서는 getter / setter 를 이용한다 
 */
public class TestInheritance2 {
	public static void main(String[] args) {
		Child c = new Child(); // 부모클래스
		c.play();
	}	
}
