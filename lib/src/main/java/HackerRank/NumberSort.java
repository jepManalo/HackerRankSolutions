package HackerRank;

import java.text.MessageFormat;
import java.util.List;

public class NumberSort {

	public static void main(String[] args) {
		
		var arrayOfNumbers = new int[] {5,8,1,6,9,4,3,7,2,5};		
		
		//DESCENDING
		for(var x = 0; x < arrayOfNumbers.length; x++) {
			
			for(var y = x + 1; y < arrayOfNumbers.length; y++) {
				
				var firstNum = arrayOfNumbers[x];
				var secondNum = arrayOfNumbers[y];
				
				if(secondNum > firstNum) {
					
					var placeHolder = firstNum;
					arrayOfNumbers[x] = secondNum;
					arrayOfNumbers[y] = placeHolder;
				}
			}
		}
		
		for(var x = 0; x < arrayOfNumbers.length; x++) {
			
			System.out.print(MessageFormat.format("{0} ", arrayOfNumbers[x]));
		}
		
		System.out.println();
		
		
		//ASCENDING
		for(var x = 0; x < arrayOfNumbers.length; x++) {
			
			for(var y = x + 1; y < arrayOfNumbers.length; y++) {
				
				var firstNum = arrayOfNumbers[x];
				var secondNum = arrayOfNumbers[y];
				
				if(secondNum < firstNum) {
					
					var placeHolder = firstNum;
					arrayOfNumbers[x] = secondNum;
					arrayOfNumbers[y] = placeHolder;
				}
			}
		}
		
		for(var x = 0; x < arrayOfNumbers.length; x++) {
			
			System.out.print(MessageFormat.format("{0} ", arrayOfNumbers[x]));
		}
	}

}
