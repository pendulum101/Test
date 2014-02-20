package string;

import java.util.Stack;

public class Palindrome {
	
	public static boolean isPalindromeStk(String in){
		Stack<Character> stk = new Stack<Character>();
		String input = in.trim();
		int n = input.length()/2;

		for(int i =0 ; i < n; ++i){
			stk.push(in.charAt(i));
		}
		if(input.length() % 2 != 0){
			n++;
		}
		for(; n < input.length(); n++){
			if (input.charAt(n) != stk.pop() ){
				return false;
			}
		}
		if (!stk.isEmpty()){
			return false;
		}
		
		return true;
	}
	
	public static boolean isPalindrome(String in){
		String input = in.trim();
		int j = input.length();
		for(int i  = 0 ; i <= input.length()/2; i++){
			if(input.charAt(i) != input.charAt(j-i)){
			return false;
			}
		}
		
		return true;
	}
}
