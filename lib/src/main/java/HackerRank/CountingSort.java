package HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class CountingSort {

	class Result {

	    /*
	     * Complete the 'countingSort' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */	
	    public static List<Integer> countingSort(List<Integer> arr) {
	    	
	    	var listOfInteger = new ArrayList<Integer>();
	    	
	    	for(var x = 0; x < 100; x++) {
	    		
	    		var count = 0;
	    		
	    		for(var element : arr) {
	    			if(element == x) count++;
	    		}
	    		
	    		listOfInteger.add(count);
	    	}
	    	
	    	return listOfInteger;

	    }

	}

	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
	

}
