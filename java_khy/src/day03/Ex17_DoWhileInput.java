package day03;

import java.util.Scanner;

public class Ex17_DoWhileInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("입력 : ");
			ch = scan.next().charAt(0);
		}while(ch != 'q');
		
		System.out.println("프로그램을 종료합니다.");
	}
}