package step2_test;

public class MyDate {
	
	public int day = 1;
	private int capsulationDay = 1; // 인스턴스 변수 
	
	public int getCapsulationDay() {
		return capsulationDay;
	}
	
	// set 에서 검증 한다.
	public void setCapsulationDay(int capsulationDay ) {
		if(capsulationDay >= 1 && capsulationDay <= 31) { // 1이상 31이하 
			// this : 현재 객체를 가르키는 자바 키워드
			// this.capsulDay : 인스턴스 변수를 가르킨다
			this.capsulationDay = capsulationDay;
		} else {
			System.out.println(capsulationDay + "잘못된 날짜 정보를 할당 하였습니다.");
		}
	}
}
