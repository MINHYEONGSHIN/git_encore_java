package com.encore.movie.workshop7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MovieServiceImpl {
    private String[] sentenceDictionary = { "Matrix",
            "I know what you did last summer", "The Silence Of The Lambs",
            "Saving Private Ryan", "Black Hawk Down", "American Pie",
            "Enemy Of The State" };

    
    private ArrayList<String> lst = null;
    
    public MovieServiceImpl() {
    	lst = new ArrayList<String>(Arrays.asList(selectSentence()));
    }
    
    /*
     * 임의의 영화 제목 반환
     * Random(nextInt())
     */
    
    public String  selectSentence() {
    	Random rnd = new Random();
    	int idx = rnd.nextInt(sentenceDictionary.length); 
    	return sentenceDictionary[idx];
    }
    
    public String disguiseSentence(String selectedSentence) {
    	StringBuilder disguisedString = new StringBuilder();
    	String [] ary = new String[selectedSentence.length()] ; 
    	for (int idx = 0 ; idx < selectedSentence.length(); idx++) {
    		if(selectedSentence.charAt(idx) == ' ') {
    			ary[idx] = " " ; 
    		}else {
    			ary[idx] = "\u25A1" ;
    		}
    		disguisedString.append(ary[idx]) ; 
    	}
    	//System.out.println("debug >>>> " + ary);
//    	for(int idx = 0 ; idx < ary.length ; idx++) {
//    		System.out.print(ary[idx]);
//    	}
    	System.out.println("debug>>>> "+disguisedString);
    	return disguisedString.toString() ; 
    } 
    
    /*
     * 게임의 초기화 화면을 출력하고 숨겨진 영화제목 반환
     */
    
    public String initGame(String selectedSentence) {
    	System.out.println("==========================================");
    	System.out.println("영화제목 맞춰보기");
    	System.out.println("5번의 기회가 주어집니다.");
    	System.out.println("==========================================");
    	return null;
    }
    
    /*
     * Scanner, BufferedReader
     * 사용자로부터 한 문자를 입력받아서 반환 
     */
    
    public String getOneLetter() {
    	return null;
    }
   
    /*
     * 영화제목에서 입력받은 문자를 정답으로 변경하고 찾았는지 여부를 반환
     * @param String 영화제목
     * @param String 문제 풀이중인 영화제목
     * @param String 사용자가 입력한 한 문자
     */
    public boolean checkString(String selectedSentence, StringBuffer solvingSentence, String letter) {
    	return true;
    }
}
