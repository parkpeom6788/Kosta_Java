package step1_test;

public class TestPrimitiveDataType {
	public static void main(String[] args) {
		// 정수형
		byte b1 = 1;
		System.out.println(b1); // 1
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		byte b2 = 127;
		System.out.println(b2);
		short s1 = 128;
		System.out.println(s1);
		int i = 1;
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		float f = 3.14f;
		System.out.println(f);
		double d = 3.14; 
		char c = 'a';
		System.out.println(c);
		boolean bol = true;
		bol = false;
		System.out.println(bol);
		System.out.println(bol);
		byte num1 = 5;
		byte num2 = 10;
		byte num3 = (byte)(num1+num2);
		System.out.println(num3);
	}
}
