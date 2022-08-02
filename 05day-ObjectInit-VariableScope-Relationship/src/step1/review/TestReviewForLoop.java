package step1.review;
// 명령프롬프트 창에서 실행해본다. 
//  bin에서 실행함 cd(change directory)로 이동  
// java step1.review.TestReviewForLoop
// C:\kosta250\se-workspace\05day-ObjectInit-VariableScope-Relationship\bin>java step1.review.TestR
public class TestReviewForLoop {
	public static void main(String[] args) {
		/*
			구구단 2단 ~ 9단
			2 * 1 = 2 	2 * 2 = 4 
		*/
		MultiPle m = new MultiPle();
		m.gugudan();
		// 2*1 3*1 4*1 5*1 6*1 
		System.out.println("*********************");
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j + "*" +i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
