package step2;

public class MyDate {
	public int day=1; // 초기값1일
	private int capsulationDay=1;
	public int getCapsulationDay() {
		return capsulationDay;
	}
	// 검증 
	public void setCapsulDay(int capsulationDay) {
		// 조건문을 사용해 1부터 31일때만 할당되도록 한다 -> 이후 공부예정
		if(capsulationDay >= 1 && capsulationDay <= 31) { // 1이상 31이하 
			// this : 현재 객체를 가르키는 자바 키워드
			// this.capsulDay : 인스턴스 변수를 가르킨다 
			this.capsulationDay = capsulationDay;
		} else {
			System.out.println(capsulationDay + " 잘못된 날짜 정보이므로 할당하지 않습니다");
		}
	}
}
