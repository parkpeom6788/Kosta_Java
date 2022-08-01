package step4;

public class MyDate { // 인스턴스 변수 
	// 인스턴스 변수 정수형을 선언만 하면
	// 기본 초기화는 0으로 됨
	private int month; 
	public MyDate() {}
	// 생성자에서 조건문 쓰기
	public MyDate(int month) {
		//월 정보는 1 이상 12 이하일때만 할당하게 한다
		if(month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("month는 1이상 12이하만 가능");
		}
	}
	public int getMonth() {
		return month;
	}
}
