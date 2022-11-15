package HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CeasarCipher {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        System.out.println(result);

        bufferedReader.close();
    }
	
	/*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
	class Result { 
		
		public static String caesarCipher(String s, int k) {
			
		    var alphabet = new ArrayList<Character>();
		    var finalString = "";
		    var finalK = k - ((k / 26) * 26);
		    
		    for (var x = 'a'; x <= 'z'; x++) {
		    	alphabet.add(x);
		    }
		    
		    var alphaMove = new ArrayList<Character>(alphabet);
		    
		    var rangeRemoved = alphaMove.subList(finalK, 26)
		    		.stream().collect(Collectors.toList());
		    alphaMove.removeAll(rangeRemoved);
		    alphaMove.addAll(0, rangeRemoved);
		    
		    for(var element : s.toCharArray()) {
		    	
		    	if(Character.isLetter(element)) {
		    		
		    		var loc = Character.isUpperCase(element) 
		    				? alphabet.indexOf(Character.toLowerCase(element))
		    				: alphabet.indexOf(element);
		    		
		    		var newChar = Character.isUpperCase(element) 
		    				? Character.toUpperCase(alphaMove.get(loc))
		    				: alphaMove.get(loc);
		    		
		    		finalString += newChar;
		    	}
		    	else {
		    		
		    		finalString += element;
		    	}
		    }
		    
		    return finalString;
		}
	}
	
} 

