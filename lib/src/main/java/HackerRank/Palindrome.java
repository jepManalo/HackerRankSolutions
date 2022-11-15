package HackerRank;

import java.text.MessageFormat;
import java.util.regex.Pattern;

public class Palindrome {

	public static void main(String[] args) throws Exception {
		
		var word = "racecar";
		
		//CHECK first if there are special Characters
		var pattern = Pattern.compile("[^a-zA-Z0-9]");
		var matcher = pattern.matcher(word);
        var isStringContainsSpecialCharacter = matcher.find();
		
		if(isStringContainsSpecialCharacter) {
			
			throw new Exception (MessageFormat.format("{0} This is a string with Special Characters", word));
		}
		
		var wordLength = word.length();
		var isPalindrome = false;
		
		for(var x = 1; x <= wordLength / 2; x++) {
			
			if(Character.toLowerCase(word.charAt(x - 1)) == Character.toLowerCase(word.charAt(wordLength - x))) {
				
				isPalindrome = true;
				continue;
			}
			else {
				
				isPalindrome = false;
				break;
			}
		}
		
		var result = isPalindrome 
				? "This is a Palindrome" 
				: "This is NOT a Palindrome";
		
		System.out.println(result);
	}

}
