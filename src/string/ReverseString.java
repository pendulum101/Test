package string;

import java.util.*;
//import java.lang.String;

public class ReverseString {

	public static String reverseOrder(String in){
		Stack<String> stk = new Stack<String>();
		String out ="";
		String[] array = in.split(" ");
		for(int i = 0 ; i < array.length; i++ ){
			stk.push(array[i]);
		}
		if(array.length > 0)
		{
			out = stk.pop();
			while( stk.empty() != true){
				out +=" "+stk.pop();
			}
		}
		return out;
	}

	public static String reverseCharacters(String in){
		Stack<Character> stk = new Stack<Character>();
		String out = "";
		for(int i= 0; i < in.length(); i++){
			stk.push(in.charAt(i));
		}
		while(stk.empty() != true)
			out += stk.pop();
		return out;
	}

	public static String reverseCharsNotWords(String in){
		Stack<Character> stk = new Stack<Character>();
		String out="";

		for(int i = 0; i < in.length(); i++){
			if(in.charAt(i) != ' ' && i != in.length()-1){
				stk.push(in.charAt(i));
			} else{
				while(stk.empty() != true)
					out += stk.pop(); 
				out += in.charAt(i);
			}
		}
		return out;
	}

}
