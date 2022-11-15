package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class TradeByte2 {

	public static void main(String[] args) {
		
		var num = solution("ccaaffddecee");
		System.out.println(num);
	}
	
	public static int solution(String S) {
		
		char[] stringArray = S.toCharArray();
        
		HashMap<Character, Integer> charIntMapping = new HashMap<Character, Integer>();
		
        int removeCount = 0;
         
        for(char ch : stringArray){
        	
            if(!charIntMapping.containsKey(ch)){
            	
            	charIntMapping.put(ch, 1);
            }
            else {
            	
            	charIntMapping.put(ch, charIntMapping.get(ch) + 1);
            }
        }
        
        ArrayList<Integer> repetitions = new ArrayList<>(charIntMapping.values());
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int rep: repetitions){
        	
            if(!set.contains(rep)){
            	
                set.add(rep);
            }
            else{
            	
                while(rep > 0 && set.contains(rep)){
                	
                	rep--;
                	removeCount++;
                }
                
                set.add(rep);
            }
        }
        
        return removeCount;
    }
}
