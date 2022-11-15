package HackerRank;


public class AsteriskPyramid {
	
	public static void main(String[] args) {
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
				
		var size = 9;
		
		for(var x = size; x > 0; x--) {
			
			for(var y = 0; y < x; y++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(var x = 1; x <= size; x++) {
			
			for(var y = 0; y < x; y++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		/* *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for(var x = 0; x < size; x++){
			
			//SPACES
			for(var y = 0; y < x; y++) {
				System.out.print(" ");
			}
			
			//ASTERISKS
			for(var z = 0; z < size - x; z++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		
		for(var x = 1; x <= size; x++) {
			
			//SPACES
			for(var y = 0; y < size - x; y++) {
				System.out.print(" ");
			}
			
			//ASTERISKS
			for(var z = 0; z < x; z++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		
		/* Inverted Pyramid */
		/* *******    *****    *********
		 *  *****      ***      *******
		 *   ***        *        *****
		 *    *                   ***
		 *                         *
		*/
		
		var counter = 0;
		var linePrint = size - (size / 2);
		
		for(var x = 0; x < linePrint; x++) {
			
			//SPACES
			for(var z = 0; z < x; z++) {
				System.out.print(" ");
			}
			
			//ASTERISKS
			for(var y = 0; y < size - counter; y++) {
				System.out.print("*");
			}
			
			counter += 2;
			
			System.out.println();
		}

//		var counter = 0;
//		
//		if(size % 2 != 0) {
//		
//			for (var x = 0; x < size; x++) {
//				
//				//To limit the lines created
//				if (x % 2 == 0) {
//					
//					//SPACES
//					for (var y = 0; y < counter; y++) {
//						System.out.print(" ");
//					}
//					
//					//ASTERISKS
//					for (var y = 0; y < size - x; y++) {
//						System.out.print("*");
//					}
//					
//					counter++;
//					
//					System.out.println();
//				}
//			}
//		}	
		
		System.out.println();
		
		/* Pyramid */
		/*    *
		 *   ***
		 *  *****
		 * *******
		 */
		
		//Size: 3 -> Spaces need before (*) on 1st line: 1 // 5 -> 2 // 7 -> 3 // 9 -> 4 // 11 -> 5 ===> size / 2
		var counter2 = size / 2;
		
		for(var x = 0; x < size; x++) {
			
			//To limit the line printouts
			if(x % 2 == 0) {
				
				//SPACES
				for(var y = 0; y < counter2; y++) {
					System.out.print(" ");
				}
				
				//ASTERISKS
				for(var z = 0; z < x + 1; z++) {
					System.out.print("*");
				}
				
				counter2--;
				
				System.out.println();
			}
		}
		
//		counter = size / 2; 
//		
//		if(size % 2 != 0) {
//			
//			for (var x = 0; x < size; x++) {
//				
//				//How many sets are printed out
//				if (x % 2 == 0) {
//					
//					//Spaces
//					for (var y = 0; y < counter; y++) {
//						
//						System.out.print(" ");
//					}
//					
//					//Asterisks
//					for(var z = 0; z < x + 1; z++) {
//						
//						System.out.print("*");
//					}
//					
//					counter--;
//					
//					System.out.println();
//				}
//			}
//		}
	}
}
