package step9;
public class MyDate {
	private int birthDay;
	/*
	 * 생일은 1 이상 31 이하일때만 할당 
	 * 그 외의 정보는 DayException throw , throws 
	 * 											발생시키고 전달하겠다는 의미
	 */
	// 적합하지않은 정보를 넣으면 객체생성을 하지 않는다 
	// throw new를 하지않으면 잘못된값이 들어가도 객체생성을못막음
	// 무조건 throw new를 해줘야 한다. 
	public MyDate(int birthDay) throws DayException { 
		if(birthDay < 1 || birthDay > 31)  // 1미만 31초과
			throw new DayException(birthDay + " 잘못된 day 정보입니다.");
	    this.birthDay = birthDay;
	}
	public int getBirthDay() {
		return birthDay;
	}	
}
