import java.io.File;  //  File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project4 {
	  public static void main(String args[]) {
		
		int numElements;
		

		try {
			//Create file, read file, and create array
			File file = new File("input.txt");
			Scanner scanner = new Scanner(file);
			numElements = scanner.nextInt();
			int [] array = new int [numElements];
			
			
			//Input Text File to Array
			for(int i=0; i < numElements; i++) {
				array[i] = scanner.nextInt();
			}
			
			System.out.println(findSum(array));
		}
		 catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}//end-main
	  static int findSum(int array[]) {	  
		 int sumOne = array[0], sumTwo = 0;
	     for (int i = 1; i < array.length; i++){
	    	 int temp = Math.max(sumOne,sumTwo);
	         sumOne = sumTwo + array[i];
	         sumTwo = temp;
	      }
	        return Math.max(sumOne,sumTwo);
		}
}
