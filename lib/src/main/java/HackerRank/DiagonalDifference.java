package HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

	class Result {

	    /*
	     * Complete the 'diagonalDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */
	    public static int diagonalDifference(List<List<Integer>> arr) {
	    	
	    	var sumLR = 0;
	    	var sumRL = 0;
	    	
	    	//Left to Right
	    	for(var x = 0; x < arr.size(); x++) {
	    		
	    		for(var y = 0; y < arr.size(); y++) {
	    			
	    			if (x == y) {
	    				sumLR += arr.get(x).get(y);
	    				break;
	    			}
	    		}
	    	}
	    	
	    	//Right to Left
	    	for(var x = arr.size() - 1; x >= 0; x--) {
	    		
	    		for(var y = 0; y < arr.size(); y++) {
	    			
	    			if (x + y == arr.size() - 1) {
	    				sumRL += arr.get(y).get(x);
	    				break;
	    			}
	    		}
	    	}
	    	
	    	var diff = Math.abs(sumLR - sumRL);
	    	
	    	return diff;
	    }

	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        System.out.println(String.valueOf(result));

        bufferedReader.close();
    }
	

}
