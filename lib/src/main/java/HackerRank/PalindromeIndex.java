package HackerRank;

public class PalindromeIndex {

	public static void main(String[] args) throws Exception {
		
		String word = "kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk";
		Integer wordLength = word.length();
		StringBuilder sb = new StringBuilder(word);
		
		Integer index = -1;
		
		for(Integer x = 1; x <= wordLength / 2; x++) {
			
			if(Character.toLowerCase(word.charAt(x - 1)) == Character.toLowerCase(word.charAt(wordLength - x))) {
				
				continue;
			}
			else {
				
				StringBuilder newWord = sb.deleteCharAt(x - 1);
				index = IsPalindrome(newWord) ? x - 1 : wordLength - x;
				
				break;
			}
		}
		
		System.out.println(index);
	}
	
	public static boolean IsPalindrome(StringBuilder newWord) {
		
		boolean isPalindrome = false;
		int wordLength = newWord.length();
		
		for(Integer y = 1; y <= wordLength / 2; y++) {
			
			if(Character.toLowerCase(newWord.charAt(y - 1)) == Character.toLowerCase(newWord.charAt(wordLength - y))) {
				
				isPalindrome = true;
				continue;
			}
			else {
				
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}

}
