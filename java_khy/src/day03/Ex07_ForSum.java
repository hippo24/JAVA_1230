package day03;

public class Ex07_ForSum {

	public static void main(String[] args) {
		/* 1부터 10까지의 합을 구하는 코드를 작성하세요.
		 *		sum0 = 0
		 * i=1	sum1 = sum1 + 1
		 * i=2	sum2 = sum2 + 2
		 * i=3	sum3 = sum3 + 3
		 * ...
		 * i=10 sum10 = sum9 + 10
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : sum = sum + i => sum += i 
		 * 반복문 종류 후 : sum을 출력 
		 */
		int num = 10;
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
		/* 1부터 10까지의 짝수의 합*/
		sum = 0;
		for(int i = 2; i<=num; i+=2) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지 짝수의 합 : " + sum);		
	}
}