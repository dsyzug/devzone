package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchString {
	
	public static void main(String[] args) {
		String[] array = {"Delhi", "Gurgaon", "Hyderabad", "Kolkata", "Mumbai", "Noida", "Pune"};
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("\nArray of strings: " + Arrays.toString(array));
			System.out.print("Input string to search (Hit enter to terminate):");
			String toFind = scanner.nextLine();
			if(toFind.equals("")){
				System.out.println("Terminating the program...");
				scanner.close();
				System.exit(0);
			}
			System.out.println("Found " + toFind + " at index : " + binarySearch(toFind, array));
		}
		
	}
	
	/**
	 * Searches the array of sorted strings and returns the first index where the first match is found.
	 * If no match is found, it returns -1.
	 * @param toFind string to search
	 * @param array array of sorted strings
	 * @return -1 or index where first match is found
	 */
	public static int binarySearch(String toFind, String[] array){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
			int mid = (low + high) / 2;
			int compare = toFind.compareTo(array[mid]);
			//System.out.printf("low:%d, high:%d, mid:%d, compare:%d\n", low, high, mid, compare);
			if (compare == 0) { //match found
				return mid;
			}
			if (compare < 0) { // search left half
				high = mid - 1;
			} else { // search right half
				low = mid + 1;
			}
		}
		return -1;
	}
}
