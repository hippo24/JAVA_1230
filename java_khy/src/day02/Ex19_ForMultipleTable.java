package day02;

public class Ex19_ForMultipleTable {

	public static void main(String[] args) {
		/* 2단을 출력하는 코드를 작성하세요.
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 반복 횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 2 x i = 2*i
		 * 반복문 종료 후 : 없음
		 */
		
		int num = 2;
		for(int i = 1; i<=9; i++) {
			System.out.println(num + " x " + i +  " = " + num*i); 
		}

	}

}
