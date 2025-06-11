package ABC;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        printArray(arr);

        
        reverseArray(arr);

        System.out.println("Reversed Array:");
        printArray(arr);
    }

    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            
            start++;
            end--;
        }
    }

   
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

