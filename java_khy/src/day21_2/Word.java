package day21_2;

import lombok.Data;

@Data
public class Word {
	
	private String words; //단어
	private String speech; //품사
	private String meaning; //뜻
	
	public Word(String words, String speech, String meaning) {
		
	}
}
