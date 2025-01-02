package day03;

public class Ex18_MultipleTable {

	public static void main(String[] args) {
		/* 2~9단을 출력하는 코드를 작성하세요.
		 * 2단
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 3단
		 * ...
		 * 9단
		 * ...
		 * 9 x 9 = 81
		 * 
		 * 반복 횟수 : num 2부터 9까지 1씩 증가
		 * 규칙성 : num단 출력
		 * 반복문 종류 후 : 없음
		 */
		
		int num = 2;
		for(num = 2; num <= 9; num++) {
			System.out.println(num + "단");
		
		for(int i = 1; i<=9; i++) {
			System.out.println(num + " x " + i +  " = " + num*i); 
			}
		}
	}
}
