package day01;

public class Ex03_VariableNumber {

	public static void main(String[] args) {
		byte num1 = 1;
		//num1 = 12345; //byte는 128까지
		System.out.println(num1);
		int num2 = 123456789;
		//num1 = 123456789012; // 인트 저장 범위를 넘음
		System.out.println(num2);
		long num3 = 123456789012L;//접미사 L을 안 붙으면 int형이라 에러
		System.out.println(num3);
	
		float num4 = 3.14F;// 3.14는 double형이라 접미사 F(float)를 붙임
		System.out.println(num4);// 소수점 9자리까지 확인
		System.out.printf("%.9f\n",num4);
		
		double num5 = 3.14;//소수점 20자리까지 확인
		System.out.printf("%.50f\n",num5);
		
		//십진수 표현이 아닌 값을 정수에 저장하는 예제
		int num6 = 0x10; //0x = 16진수
		System.out.println(num6);
		
		int num7 = 010; // 0 = 8진수
		System.out.println(num7);
		
		int num8 = 0b10; // 0b = 2진수
		System.out.println(num8);
		
		int num9 = 'A'; // 'A'의 해당하는 정수값(0041)이 저장
		System.out.println(num9);
		
		double num10 = 1e3; // 1*10^3 => 1000.0
		System.out.println(num10);
	}

}
