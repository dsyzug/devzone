package sorting;

import java.util.Arrays;

/**
 *
 * @author dhirendra
 */
public class SelectionSearch {
    
    public static void main(String[] args) {
        int[] array = {31, 15, 6, 2, 1, 10, 2, 2, -1, 4, 2, 7, 7, 90, 45};
        System.out.println("Before sorting:" + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After sorting:" + Arrays.toString(array));
    }
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = getMinIndex(i, array);
            swap(i, minIndex, array);
            //System.out.printf("i:%d, minIndex:%d\n", i, minIndex);
            //System.out.println("array:" + Arrays.toString(array) + "\n\n");
        }
    }
    
    public static int getMinIndex(int start, int[] array){
        int min = start;
        for(int i = start; i < array.length; i++){
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
    
    public static void swap(int p, int q, int[] array){
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
}
