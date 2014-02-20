package string;

public class PigLatin {

	public static String pigLatinConvertor(String in){
		String pigLatin = "";
		int i = 0;
		for (int j = 1 ; j < in.length(); j++ ) {
			if(in.charAt(j) == ' ' || j == in.length()-1 ){
				pigLatin += pigWordCreator(in.substring(i, j+1)) + ' ';
				i = j+1;
			}
		}
		return pigLatin;
	}

	public static String pigWordCreator(String in){
		String word = "";
		in = in.trim();
		if (in.length() > 0){
			char f = in.charAt(0);
			if( f == 'a' ||f == 'e' ||f =='i' ||f =='o' ||f =='u'){
				word = in + "way";
			} else{
				word = in.substring(1) + f +"ay";
			}
		}
		return word;
	}
}