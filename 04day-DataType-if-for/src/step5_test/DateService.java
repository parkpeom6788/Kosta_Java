package step5_test;

public class DateService {
	
	private int day;
	private int month;
	
	public void printLastDay(int month) {
		if(month >= 1 && month <= 12) {
			switch(month) {
			case 4: case 6: case 9: case 11: printDetail(month,30); break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: printDetail(month,31); break;
			default : printDetail(month,28);
			} 
		} else {
			System.out.println("잘못된 달을 입력 하셨습니다.");
		}
 	}
	public void printDetail(int month,int day) {
		System.out.println(month + "월의 마지막 일수는 "+ day +"일 입니다.");
	}
}
