package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class FlippingTheMatrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = flippingMatrix(matrix);

                System.out.println(String.valueOf(result));
                System.out.println();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
	}
	
	public static int flippingMatrix(List<List<Integer>> matrix) {
	    
		int max = 0;
		int total = 0;
		
		//OUTSIDE CORNERS
		for(int row = 0; row < matrix.size() / 2; row++) {
			
			for(int col = 0; col < matrix.size() / 2; col++) {
				
				//CORE: n * 2 - 1 - col && n * 2 - 1 - row
				max = 0;
		        max = Math.max(matrix.get(row).get(col), max);
		        max = Math.max(matrix.get(row).get(matrix.size() - 1 - col), max);
		        max = Math.max(matrix.get(matrix.size() - 1 - row).get(col), max);
		        max = Math.max(matrix.get(matrix.size() - 1 - row).get(matrix.size() - 1 - col), max);
		        
		        total += max;
			}
		}
		
		return total;
	}

}
