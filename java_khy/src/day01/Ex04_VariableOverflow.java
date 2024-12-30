package day01;

public class Ex04_VariableOverflow {

	public static void main(String[] args) {
		byte num1 = 127;
		num1++;//num1 1을 증가
		System.out.println(num1);//표현 가능한 가장 큰 숫자에 1을 더하면 128이 아닌 -128 출력
		
		byte num2 = -128;
		num2--;//num2에 1을 감소
		System.out.println(num2);//표현 가능한 가장 작은 숫자에 1을 뺴면 -129가 아닌 127 출력
	}

}
