package Step5;
/*
 * 2월 : 28
 * 4,6,9,11월 : 30
 * 1,3,5,7,8,10,12월 : 31
 * 나머지 : 잘못된 입력값입니다.
 */
// 코드 개선 : 리팩토링 
public class DateService {
	private int day;
	private int month;
	public void printLastDay(int month) {
		if(month >= 1 && month <= 12) {
			switch(month) {
				case 4 : case 6: case 9: case 11: day = 30; break; // printDetail(month,30);
				case 1 : case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break; // printDetail(month,31);
				default : day = 28; // // printDetail(month,28);
			} this.month = month;
		} else {
			System.out.println("잘못된 달 입력");
		} // else 
	} // class
	// 위 메서드에서 재사용할 상세 출력 메서드 
//	public void printDetail(int month,int lastDay) {
//		System.out.println(month + "월의 마지막 일은 " + day+"일 입니다.");
//	}
	public void getDay() {
		System.out.println(month + "월의 마지막 일은 " + day+"일 입니다.");
	}
	public int getMonth() {
		return month;
	}
} // class
