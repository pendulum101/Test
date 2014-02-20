package main;

import string.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(ReverseString.reverseOrder("Test this method tperchance"));	
		System.out.println(ReverseString.reverseCharacters("Test this method tperchance"));	
		System.out.println(ReverseString.reverseCharsNotWords("Test this method tperchance"));	
		System.out.println(PigLatin.pigLatinConvertor("What is this"));
		
		System.out.println(Palindrome.isPalindromeStk("racecar"));
	}


}