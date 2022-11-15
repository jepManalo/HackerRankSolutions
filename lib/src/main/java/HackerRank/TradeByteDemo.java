package HackerRank;

import java.util.Arrays;
import java.util.Comparator;

public class TradeByteDemo {

	public static void main(String[] args) {
		
//		int [] A = new int[] { 2, 300, 100, 800, 10548 };
//		Arrays.sort(A);
		
		int[] numberSet1 = {1, 3, 6, 4, 1, 2};
        int[] numberSet2 = {-1, -3};
        int[] numberSet3 = {1, 2, 3};
		
        
        var abc = findTheSmallest(numberSet1);
        var def = findTheSmallest(numberSet2);
        var ghi = findTheSmallest(numberSet3);
        
        System.out.println(abc);
        System.out.println(def);
        System.out.println(ghi);
	}
	
	public static int findTheSmallest (int [] A) {
    	
    	int[] B = Arrays.stream(A).filter(x -> x > 0).distinct().sorted().toArray();
    	
        for (int i = 0, index = 1; i < B.length; i++, index++) {
            if (index != B[i]) {
            	return index;
            }
        }
        
        return B.length + 1;
    }

}
