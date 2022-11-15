package HackerRank;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.expectThrows;

public class LonelyInteger {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        var result = Result.lonelyinteger(a);

        System.out.println(String.valueOf(result));

        bufferedReader.close();
    }

	class Result {

	    /*
	     * Complete the 'lonelyinteger' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY a as parameter.
	     */
	    public static int lonelyinteger(List<Integer> a) {
	    	
	    	var lonelyInt = a.stream().filter(x -> Collections.frequency(a, x) == 1)
	    			.findFirst()
	    			.get();
	    	
	    	return lonelyInt;
	    }

	}
}
