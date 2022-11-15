package HackerRank;

import java.io.Console;
import java.util.Scanner;

public class MockTestBasic1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
        int n = Integer.parseInt(sc.nextLine());

        fizzBuzz(n);

	}
	
	public static void fizzBuzz(int n) {
		
		for(var x = 1; x <= n; x++) {
			
			if(x % 3 == 0 && x % 5 == 0) {
				
				System.out.println("FizzBuzz");
			}
			else if(x % 3 == 0 && x % 5 != 0) {
				
				System.out.println("Fizz");
			}
			else if(x % 5 == 0 && x % 3 != 0) {
				
				System.out.println("Buzz");
			}
			else {
				
				System.out.println(x);
			}
			
		}

	}

}
