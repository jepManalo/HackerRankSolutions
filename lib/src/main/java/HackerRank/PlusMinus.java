package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class PlusMinus {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
	
	class Result {

	    /*
	     * Complete the 'plusMinus' function below.
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */
	    public static void plusMinus(List<Integer> arr) {
	    	
	    	double positive = 0, negative = 0, zero = 0;
	    	double ratioPos, ratioNeg, ratioZero;
	    	
	    	for(int element : arr) {
	    		
	    		if(element > 0) {
	    			positive++;
	    		}
	    		else if(element < 0) {
	    			negative++;
	    		}
	    		else {
	    			zero++;
	    		}
	    	}
	    	
	    	ratioPos = positive / arr.size();
	    	ratioNeg = negative / arr.size();
	    	ratioZero = zero / arr.size();

	    	System.out.println(String.format("%.6f", ratioPos));
	    	System.out.println(String.format("%.6f", ratioNeg));
	    	System.out.println(String.format("%.6f", ratioZero));
	    }

	}	
}
