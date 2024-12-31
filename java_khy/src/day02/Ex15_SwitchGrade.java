package day02;

public class Ex15_SwitchGrade {

	public static void main(String[] args) {
		/* 주어진 성적에 맞는 학점을 출력하세요.
		 * A:90~109
		 * B:80~89
		 * C:70~79
		 * D:60~69
		 * F:0~59
		 * 잘못된 성적:110이상, -9미만
		 */

		int score = 109;
		switch(score / 10) {
		case 10,9:
			System.out.println(score + "는 A");
			break;
		case 8:
			System.out.println(score + "는 B");
			break;
		case 7:
			System.out.println(score + "는 C");
			break;
		case 6:
			System.out.println(score + "는 D");
			break;
		case 5,4,3,2,1,0:
			System.out.println(score + "는 F");
			break;
		default:
			System.out.println(score + "는 잘못된 성적");
	}

	}
}