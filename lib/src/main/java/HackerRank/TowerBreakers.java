package HackerRank;

import java.io.*;
import java.util.stream.IntStream;

public class TowerBreakers {
	
	class Result {

	    /*
	     * Complete the 'towerBreakers' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER m
	     */

	    public static int towerBreakers(int n, int m) {
	    	
	    	var winner = 1;
	    	
	    	if (m == 1) {
	    		
	    		winner = 2;
	    	}
	    	else {
	    		
    			if(n % 2 == 0) {
    				
    				winner = 2;
    			}
	    		
	    	} 
	    	
	    	return winner;
	    }

	}

	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.towerBreakers(n, m);

                System.out.println(String.valueOf(result));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
