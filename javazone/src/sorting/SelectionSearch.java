package sorting;

import java.util.Arrays;

/**
 *
 * @author dhirendra
 */
public class SelectionSearch {
    
    public static void main(String[] args) {
        int[] array = {31, 15, 6, 2, 1, 10};
        System.out.println("Before sorting:" + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After sorting:" + Arrays.toString(array));
    }
    
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 2; i++){
            for (int j = i; j < array.length -1; j++) {
                int indexMin = getMinIndex();
            }
            
        }
    }
}
