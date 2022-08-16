package step3_test;

public class TestOperator {
	public static void main(String[] args) {
		int i = 3 , j = 7;
		System.out.println(i + j); // 10
		System.out.println(i - j); // -4
		System.out.println(i * j); // 21
		System.out.println(i / j); // 2
		System.out.println(i % j); // 1
		// = 할당 , == 같은지 비교
		System.out.println(i=j); // j의값을 i에 대입
		System.out.println(i+ " " +j); // 7 7
		System.out.println(i==j); // true
		int k = 1;
		System.out.println(i==k); // false
		System.out.println(i!=k); // true
		boolean flag = false;
		System.out.println(flag); // false
		System.out.println(!flag); // true
		System.out.println("***********************************");
		//증감연산자
		int a = 1;
		System.out.println(a++); // 1
		System.out.println(a); // 2
		System.out.println(++a); // 3
		System.out.println(--a); // 2
		System.out.println(a--); // 2
		System.out.println(a); // 1
		System.out.println("***********************************");
		// 대입연산자
		int money = 10000;
		// 위의 money 에 5000 누적
		// 방법1
		money = money + 5000;
		System.out.println(money);
		// 2000을 또 누적
		money += 2000;
		System.out.println(money);
		System.out.println("**************************");
		// 삼항 연산자
		int point = 1000;
		int result = (point >= 10000) ? point + 200 : point + 100;
		System.out.println(result);
	}
}
