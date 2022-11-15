package HackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Median {

	public static void main(String[] args) {
		
		List<Integer> arr = List.of(0, 1, 2, 4, 6, 5, 3);
		
		int length = arr.size();
        int medianFormula1 = length / 2;
        int medianFormula2 = (length / 2) + 1;
        int medianFormulaOdd = (length + 1) / 2;
        float median = 0;
        
        arr = arr.stream().sorted().collect(Collectors.toList());
        
        if(length % 2 == 0){
            
            median = (arr.get(medianFormula1 - 1) + arr.get(medianFormula2 - 1)) / 2f;
        }
        else{
            
            median = arr.get(medianFormulaOdd - 1);
        }
        
        System.out.println(median);

	}
	
	

}
