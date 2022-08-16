package step2_test;

public class TestArray3 {
	
	public static void main(String[] args) {
		// 배열 선언 생성 할당 동시에 
		int[] ages = {11,22,18,45,42};
		System.out.println(ages.length); // 5
		// for loop로 요소를 출력하되 아래 변수 값의 미만인 요소만 출력 
		int num = 40;
		
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] < 40) {
				System.out.print(ages[i] + " \t");
			}
		}
		// 오름차순
		int temp = 0;
		for(int i = 0 ; i < ages.length; i++) {
			for(int j = 0; j < ages.length-1-i; j++) {
				if(ages[j] > ages[j+1]) {
					temp = ages[j];
					ages[j] = ages[j+1];
					ages[j+1] = temp;
				}
			}
		}
		System.out.println();
		for(int a : ages) {
			 System.out.print(a + "\t");
		}
	}
}
