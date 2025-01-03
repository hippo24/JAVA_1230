package day04;

public class Ex03_Method {

	public static void main(String[] args) {
	int min = 1, max = 10;
	int r = random(min,max);
	System.out.println(min + "과 " + max + " 사이의 랜덤한 수 : " + r);
	}
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최대 공약수 => 정수 => int
	 * 메소드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		int gcd = 1; 
			
		for (int i = 1; i<=num1; i++) {
			if(num1 % i == 0) {
				if(num2 % i == 0) { 
					gcd = i;
				}
			}
		}
		return gcd;
	}
	/* 기능 : 두 정수의 최대 공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최초 공배수 => 정수 => int
	 * 메소드명 : lcm 
	 */
	public static int lcm(int num1, int num2) {
		for(int i = num1; ; i+= num1) {
			if(i % num2 == 0) {
				return i;
			}
		}
	}
		
	/* 기능 : 최소값과 최댓값 사이의 랜덤한 수를 생성하는 메소드
	 * 매개변수 : 최솟값, 최대값 => int min, int max
	 * 리턴타입 : 랜덤한 정수 => 정수 => int
	 * 메소드명 : random
	 */	
	public static int random(int min, int max) {
		return(int)(Math.random()*(max - min + 1) + min);
	}
}