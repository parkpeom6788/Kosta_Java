package step2_test;

public class TestArray2 {
	
	public static void main(String[] args) {
		// 배열 선언 생성 동시에
		int[] salary = new int[4];
		// 배열 요소 할당
		salary[0] = 300;
		salary[1] = 600;
		salary[2] = 500;
		salary[3] = 400;
		
		// for loop 이용 salary 배열의 모든 요소 출력
		for(int i = 0 ; i < salary.length; i++) {
			System.out.println(salary[i] + "\t");
		}
		System.out.println("*************");
		int totalSalary = 0;
		// for loop : salary 총합 
		for(int i = 0; i < salary.length; i++) {
			totalSalary += salary[i];
		}
		System.out.println("총합 : " + totalSalary); 
	}
}
