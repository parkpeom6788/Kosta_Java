package step3;
// 자바 연산자 테스트 
public class TestOperator {
	public static void main(String[] args) {
		int i = 3;
		int j = 7;
		System.out.println(i + j);  // 10
		System.out.println(i - j);  // -4
		System.out.println(i * j);  // 21
		System.out.println(j / i); //  2 몫
		System.out.println(j % i); // 1 나머지
		// = 할당 , == 같은지 비교
		
		System.out.println(i=j);   // j를 i에 할당해  출력
		System.out.println(i+" "+j); // 7 7
		System.out.println(i==j); // 값이 같은지 비교 위에서 할당했으므로 같음 
		int k = 1;
		System.out.println(i==k); //  다르므로 false 1이랑 7비교 
		// 같지 않으면 != 
		System.out.println(i!=k); // 같지않을때 true
		boolean flag = false;
		System.out.println(flag); // flase
		System.out.println(!flag); // true
		
		System.out.println("***********************************");
		// 증감연산자
		int a = 1;
		System.out.println(a++); // 1 
		System.out.println(a);  // 2
		System.out.println(++a);  // 3
		System.out.println(--a);  // 2
		System.out.println(a--);  // 2
		System.out.println(a);    // 1
		
		System.out.println("***********************************");
		// 대입연산자
		int money = 10000;
		// 위의 money에 5000 누적
		// 방법1
		money = money + 5000;
		System.out.println(money);
		// 2000을 또 누적 
		// 방법2
		money += 2000;
		System.out.println(money);
		System.out.println("*************************");
		// 삼항연산자  
		int point = 1000;
		// 조건식 ? 식1 : 식2          조건식이 참이면 식1 이 수행되고 거짓이면 식2 가 수행된다.  
		int result = (point >= 10000) ? point + 200 : point + 100;
		System.out.println(result);

	}
}














