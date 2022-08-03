package step5;

public class Test2DArray {
	
	public static void main(String[] args) {
		// 3년간 매월 강우량 저장하는 배열
		int[][]  rain = new int[3][12]; // 3칸에 각 칸에 12개 
		
		// 마지막 해의 마지막 월에 300 을 저장
		rain[2][11] = 300; // 3년 12월 
		System.out.println(rain[2][11]); // 300
		System.out.println(rain[2]); // 배열객체의 주소값
		System.out.println(rain[2].length); // 12
		System.out.println("*******");
		int[][] ms = new int[3][]; // 중학교 3학년의 각반 인원수 저장 , 학년별로 반수가 다름
		// 공간크기지정 
		ms[0] = new int[2]; // 1학년 2반으로 구성
		ms[1] = new int[3]; // 2학년 3반으로 구성 
		ms[2] = new int[5]; // 3학년 5반으로 구성 
		// 2학년 2반에 인원수 25명
		ms[1][2] = 25;
	}
}
