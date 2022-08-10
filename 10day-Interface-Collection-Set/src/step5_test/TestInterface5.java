package step5_test;

import step1_test.Flyer;
public class TestInterface5 {
	/*
	 * Eagle class 는 Bird class를 상속받고
	 * Bird class 는 Flyer interface를
	 * implements 하므로 Eagle class에서는
	 * 별도로 Flyer 를 implements 하지 않아도
	 * 아래와 같이 Flyer 인터페이스 타입으로
	 * 참조 가능 -> 즉 다형성 적용 됨 
	 */
	public static void main(String[] args) {
		Flyer f = new Eagle();
		f.fly();
		if(f instanceof Eagle) {
			((Eagle)f).hunt();
		}
	}
}
