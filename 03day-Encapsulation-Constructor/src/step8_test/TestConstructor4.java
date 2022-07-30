package step8_test;

// 생성자를 정의하고 사용하는 연습 예제
public class TestConstructor4 {
	public static void main(String[] args) {
		Food f = new Food("테라","하이트진로",1410); // 생성자를 통한 초기화 작업 
		System.out.println(f.getName());
		System.out.println(f.getMaker());
		System.out.println(f.getPrice());
		//  Food class 에서 필요한 구성요소
		//  instance Variable : 3개
		//  생성자 1개
		//  getter 3개
		
	}
}
