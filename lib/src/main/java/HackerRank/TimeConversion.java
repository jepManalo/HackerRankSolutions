package HackerRank;

import java.io.*;
import java.text.MessageFormat;

public class TimeConversion {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }

	class Result {

	    /*
	     * Complete the 'timeConversion' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts STRING s as parameter.
	     */
	    public static String timeConversion(String s) {
	    	
	    	String timeZone = s.substring(8, 10);
	    	String remainingTime = s.substring(2, 8);
	    	String hourZone = s.substring(0, 2);
	    	String newHourZone = hourZone;
	    	String newFormat = "";
	    	
	    	if (timeZone.equalsIgnoreCase("PM")) {
	    		
	    		if(!hourZone.equals("12")) {
	    			
	    			newHourZone = Integer.toString(Integer.valueOf(hourZone) + 12);
	    		}
	    	}
	    	else {
	    		if(hourZone.equals("12")) {
	    			
	    			newHourZone = "00";
	    		}
	    	}
	    	
	    	newFormat = MessageFormat.format("{0}{1}", newHourZone, remainingTime);
	    	
	    	return newFormat;
	    }

	}
}
