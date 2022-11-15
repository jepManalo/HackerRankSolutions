package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TradeByte3 {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6}; 
		var ans = solution(numbers);
		System.out.println(ans);

	}
	
	public static int solution(int[] A) {
		
		int min = Integer.MAX_VALUE; 
		
		for(int x = 0; x < A.length; x++) {
			
			for(int y = 0; y < A.length; y++) {
				
				int sum = 0;
				
				if(x == y || x + 1 == y || x - 1 == y) {
					
					continue;
				}
				else {
					
					sum = A[x] + A[y];
					
					if (sum < min) {
						
						min = sum;
					}
				}
			}
			
		}
		
		return min;
    }
	
}


