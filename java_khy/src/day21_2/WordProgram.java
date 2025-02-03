package day21_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordProgram implements ConsoleProgram {
	Scanner scan = new Scanner(System.in);
	static List<Word> list = new ArrayList<Word>();
	/* 단어장 프로그램을 구현하세요.
	 * - 관리자
	 * 	- 단어 등록
	 * 	- 단어 수정
	 * 	- 단어 삭제
	 * - 사용자
	 * 	- 단어 검색
	 * 	- 내 검색 단어 보기
	 * 
	 * - 주의사항
	 * 	- 중복된 단어 허용
	 * 	- 단어는 단어, 품사, 뜻으로 구성
	 * 	- 사용자는 아이디로만 구분. 중복된 아이디는 없음
	 * 	- 사용자는 회원가입을 따로 하지 않음
	 *  - 관리자는 admin으로 고정
	 *  - 저장과 불러오기 필수
	 *  
	 * 시작전
	 * 아이디 : admin
	 * 관리자 메뉴 출력
	 * 메뉴 선택 : 
	 * 
	 * 아이디 : abc
	 * 사용자 메뉴 출력
	 * 메뉴 선택 : 
	 * 
	 * */
	@Override
	public void run() {
		while(true) {
			
			printMenu();
			int menu = scan.nextInt();
			scan.nextLine();
			
			runMenu(menu);
			
			if(menu == 2) {
				break;
			}
		}
	}
	
	@Override
	public void printMenu() {
		System.out.println("---------");
		System.out.println("1. 로그인");
		System.out.println("2. 종료");
		System.out.println("---------");
	}
	
	@Override
	public void runMenu(int menu) {
		System.out.println("---------");
		switch(menu) {
		case 1:
			login();
			break;
		case 2:
			System.out.println("[프로그램 종료]");
			break;
		default:
			System.out.println("[올바른 입력이 아닙니다.]");
		}
	}

	private void login() {
		System.out.println("--------------");
		System.out.println("아이디를 입력하세요.");
		System.out.println("--------------");
		String id = scan.nextLine();
		
		if(id.equals("admin")) {
			System.out.println("관리자 메뉴로 이동합니다.");
			runAdmin();
		}else {
			System.out.println("사용자 메뉴로 이동합니다.");
			runUser();
		}
	}

	private void runAdmin() {
		while(true) {
			
			printAdminMenu();
			int menu = scan.nextInt();
			scan.nextLine();
			
			runAdminMenu(menu);
			
			if(menu == 3) {
				break;
			}
		}
	}
		

	private void runUser() {
		while(true) {
			
			printUserMenu();
			int menu = scan.nextInt();
			scan.nextLine();
			
			runUserMenu(menu);
			
			if(menu == 2) {
				break;
			}
		}
	}

	private void printAdminMenu() {
		System.out.println("------------------");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("------------------");
	}

	private void printUserMenu() {
		System.out.println("------------------");
		System.out.println("1. 단어 검색");
		System.out.println("2. 내 검색 단어 보기");
		System.out.println("------------------");
	}

	private void runAdminMenu(int menu) {
		System.out.println("------------------");
		switch(menu) {
		case 1:
			insertWord();
			break;
		case 2:
			updateWord();
			break;	
		case 3:
			deleteWord();
			break;
		default:
			System.out.println("[잘못된 메뉴입니다.]");
		}
	}

	private void runUserMenu(int menu) {
		System.out.println("------------------");
		switch(menu) {
		case 1:
			searchWord();
			break;
		case 2:
			mySearch();
			break;
		default:
			System.out.println("[잘못된 메뉴입니다.]");
		}
	}

	private void insertWord() {
		//단어 등록
		System.out.print("단어");
		String words = scan.next();
		System.out.println("품사");
		String speech = scan.next();
		System.out.println("뜻");
		String meaning = scan.next();
		
		Word word = new Word(words, speech, meaning);
		
		list.add(word);
		System.out.println("단어를 등록했습니다.");
		System.out.println(list);
		
	}

	private void updateWord() {
		//단어 수정
		System.out.print("수정할 단어");
		String words = scan.next();
		scan.nextLine();
		
		int index = list.indexOf(words);
		if(index < 0) {
			System.out.println("등록된 단어가 아닙니다.");
			return;
		}
		
		//수정할 정보를 입력
		System.out.print("품사");
		String speech = scan.nextLine();
		System.out.print("뜻");
		String meaning = scan.nextLine();
		
		System.out.println("수정했습니다.");
	}

	private void deleteWord() {
		//단어 삭제
		
	}

	private void searchWord() {
		// TODO Auto-generated method stub
		
	}

	private void mySearch() {
		// TODO Auto-generated method stub
		
	}

}
