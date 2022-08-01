package step1;
// 자바 기본형 데이터 타입을 테스트하는 예제 
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		// 정수형
		byte b1 = 1; // 노란줄 : 사용하지않음 byte형은 1byte (8bit) 
		System.out.println(b1); // 1
		// javase api를 이용해 byte형의 최소값과 최대값을 확인해본다 
		System.out.println(Byte.MIN_VALUE); // -128
		System.out.println(Byte.MAX_VALUE); // 127
		byte b2 = 127;
		System.out.println(b2);
//		b2 = 128; // 재할당 byte 범위를 넘으면 short 또는 int로 
		// byte 형의 최대값을 넘어서므로 compile error 가 난다 (short, int, long으로 처리해야 함 )
		short s1 = 128; // 2byte이므로 가능 
		System.out.println(s1);
		int i = 1;
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE); // int형의 최소값 -21억 -2147483648
		System.out.println(Integer.MAX_VALUE); //최대값 21억 2147483647
		// 금융권은 Long형을 많이씀
		// 아래는 int형의 최대값을 넘어서므로 error => long 으로 처리해야 함 
		// int i2 = 2147483648; 
		// System.out.println(i2);
		long lo = 2147483648L; // 기본형이 int 이므로 소문자 l 또는 대문자 L로 표기해주어야 한다 
		System.out.println(lo);  // 2147483648
		System.out.println(Long.MAX_VALUE); // 9223372036854775807
		System.out.println(Long.MIN_VALUE); // -9223372036854775808
		
		//실수형 
		float f = 3.14f; // 실수의 기본형이 double 이므로 데이터 마지막에는 f 또는 대문자 F 를 표기
		System.out.println(f);
		double d = 3.14; // 실수형의 기본형 double 
		// 문자형  ' ' 홀따옴표로 감싸고 한문자로만 가능 
		char c = 'a';
		System.out.println(c);
		// 논리형 boolean 은 오직 true 와 false만 할당가능
		boolean bol = true;
		bol = false;
		System.out.println(bol); // false 
		System.out.println(bol); // false 
		// type casting : 형변환의 예 
		byte num1 = 5;
		byte num2 = 10;
		// byte num3 = num1 + num2; // 연산 결과는 정수형의 기본형인 int로 인식되므로 error 
		// byte 형으로 할당하기 위해서는 type casting 형변환을 하면 됨 
		byte num3 = (byte)(num1+num2); //연산결과가 byte로 인식되도록 형변환  
		System.out.println(num3);
		
	}
}
