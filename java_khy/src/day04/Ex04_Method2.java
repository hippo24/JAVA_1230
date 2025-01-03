package day04;

public class Ex04_Method2 {

	public static void main(String[] args) {
		/* 100이하의 소수를 출력하는 코드를 작성하세요. 단 메소드를 활용해서 */
		for(int num = 1; num<=100; num++) {
			if(isPrimeNumber(num)) {
				System.out.println(num + " ");
			}
		}
		/* 10이 소수인지 아닌지 판별하는 코드를 작성하세요. 단, 메소드를 활용해서 */
	}
		
		/* 기능 : 정수가 소수인지 아닌지 판별하는 메소드
		 * 매개변수 : 정수
		 * 리턴타입 : 소수인지 아닌지 => boolean
		 * 메소드명 : isPrimeNumber
		 */
	public static boolean isPrimeNumber(int num) {
		if(num == 1) {
			return false;
		}
	
		for (int i = 2; i<=num; i++) {
			//1과 자기 자신을 제외한 수 중에서 약수를 찾으면 소수가 아님
			if(num % i == 0) {
				return false;
			}
		}
		//못 찾으면 소수
		return true;
  }
}
