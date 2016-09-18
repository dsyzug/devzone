package sorting;

import java.util.Arrays;

import testdata.Student;

public class SelectionSortGeneric<T extends Comparable<T>> {
	
	public static void main(String[] args) {
		Student anand = new Student("Anand", 24);
		Student vijay = new Student("Vijay", 19);
		Student prabhat = new Student("Prabhat", 23);
		
		Student[] students = {anand, vijay, prabhat, anand};
		
		SelectionSortGeneric<Student> ssg = new SelectionSortGeneric<>();
		System.out.println("Before sort: " + Arrays.toString(students));
		ssg.selectionSort(students);
		System.out.println("After sort: " + Arrays.toString(students));
	}
	
	public void selectionSort(T[] array){
		for (int i = 0; i < array.length - 1; i++){
			int minIndex = getMinIndex(i, array);
            swap(i, minIndex, array);
		}
	}

	public int getMinIndex(int start, T[] array){
        int min = start;
        for(int i = start; i < array.length; i++){
            if (array[i].compareTo(array[min]) < 0) {
                min = i;
            }
        }
        return min;
    }
    
    public void swap(int p, int q, T[] array){
        T temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
}
