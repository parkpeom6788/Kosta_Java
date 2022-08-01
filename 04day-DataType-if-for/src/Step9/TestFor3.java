package Step9;
/*
			1	2	3	4	5
			1	2	3	4	5
			1	2	3	4	5
 */
public class TestFor3 {
	public static void main(String[] args) {		
		System.out.print(1);
		System.out.print("\t"+2);
		System.out.print("\t"+3);
		System.out.println(); // 행 변경
		System.out.print(1);
		System.out.print("\t"+2);
		System.out.print("\t"+3);
		System.out.println();
		System.out.println("============");
		// nested for loop : for 문안의 for문을 이용해 표현 
		//for(){   // 3번반복
		// for() { // 5번반복 
		//	 	}
		//sysout();
		// }
		for(int i=1; i<=3; i++) { // 줄3번
			for(int j=1; j<=5; j++) {  // 내부5번 (자주변경되는게 for문안쪽)
				System.out.print(j+"\t"); // 5번 반복
			} // for
		System.out.println();	 // 행변경 
		} // for
	} // main
} // class
