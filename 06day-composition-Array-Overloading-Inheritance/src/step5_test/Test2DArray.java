package step5_test;

public class Test2DArray {
	public static void main(String[] args) {
		int[][] rain = new int[3][12];
		// 마지막 해의 마지막 월에 300을 저장
		rain[2][11] = 300;
		System.out.println(rain[2][11]); // 300 
		System.out.println(rain[2]); // 배열객체의 주소값
		System.out.println(rain[2].length); // 12
		System.out.println("*****");
		int[][] ms = new int[3][];
		// 공간 크기 지정 
		ms[0] = new int[2]; // 2개공간 
		ms[1] = new int[3]; // 3개공간
		ms[2] = new int[5]; // 5개공간
		
		// 2학년 2반에 인원수 25명 
		ms[1][2] = 25;
		
	}
}
