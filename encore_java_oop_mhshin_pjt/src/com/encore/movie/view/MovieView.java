package com.encore.movie.view;

import java.util.Iterator;
import java.util.Random;

public class MovieView {
	
	private int idx ;
	
    private String[] sentenceDictionary = { "Matrix",
            "I know what you did last summer", "The Silence Of The Lambs",
            "Saving Private Ryan", "Black Hawk Down", "American Pie",
            "Enemy Of The State" };
	
	
	public void selectSentence() {
		Random rnd = new Random(); 
		int idx = rnd.nextInt(sentenceDictionary.length-1);
		String result =  sentenceDictionary[idx];
		System.out.println(result);
	}
	
	public String initGame(String selectedSentence) {
		String result =" ";
		for(int idx = 0 ;idx <= selectedSentence.length();idx++) {
			if (selectedSentence[idx].equals(" ")) {
				result += " ";
			}else {
				result += \u25A1;
			}
		}
	}
	
//	public String getOneLetter() {
//		
//	}
//	

//	
//	public boolean checkString(String selectedSentence, StringBuffer solvingSentence, String letter) {
//		
//	}
}
