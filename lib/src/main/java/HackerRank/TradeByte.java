package HackerRank;

public class TradeByte {

	public static void main(String[] args) {
		

		int max = solution("50552");
		System.out.println(max);
	}
	
	public static int solution(String S) {
		
		int max = 0;
        
        for (int x = 0; x < S.length() - 1; x++) {
        	
        	int number = Integer.parseInt(S.substring(x, x + 2));
        	
        	if(number > max) {
        		
        		max = number;
        	}
        }
        
        return max;

    }

}
