package com.encore.guessgame;

import java.util.Scanner;

public class GuessGame {

	public static int getUserInput() {
		int inserted_num = 0 ;
		Scanner scan = new Scanner(System.in) ;
		inserted_num = scan.nextInt() ;
		return inserted_num ;
	}	
}
