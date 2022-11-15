package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class MinMax {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }

	class Result {

	    /*
	     * Complete the 'miniMaxSum' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */
	    public static void miniMaxSum(List<Integer> arr) {
	    	
	    	long min = Long.MAX_VALUE;
	    	long max = Long.MIN_VALUE;
	    	
	    	for(int y = 0; y < arr.size(); y++) {
	    		
	    		long sum = 0;
	    		
	    		for(int x = 0; x < arr.size(); x++) {
	    			
	    			if (x == y) continue;
	    			else {
	    				sum += arr.get(x);
	    			}
	    		}
	    		
	    		min = sum < min ? sum : min;
	    		max = sum > max ? sum : max;
	    	}
	    	
	    	/* MessageFormat.format makes the value 1239 to 1,239 */
	    	/* Use "String.valueof" to avoid this */
	    	System.out.println(MessageFormat.format("{0} {1}", 
	    			String.valueOf(min), String.valueOf(max)));
	    }

	}
}
