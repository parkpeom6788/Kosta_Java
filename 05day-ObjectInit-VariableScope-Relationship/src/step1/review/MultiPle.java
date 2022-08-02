package step1.review;

public class MultiPle {
	public MultiPle() {}
	public void gugudan() {
		for(int i = 2; i <= 9; i++) {  // 단 
			for(int j = 1; j<=9; j++) { // 1번 돌때 9번반복  
				System.out.print(" "+i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
