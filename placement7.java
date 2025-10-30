// Create an integer array of size 10. Write a java program, 
// accept a number from user, 
// print array subscripts whose values are equal to accepted number. 
//Print those array locations and their values.[Array_Values.java]

import java.util.Scanner;

public class placement7 {
    public static int searching(String[] args) {
        int array[] = new int[10];
        int left = 0;
        int right = array.length - 1;
        try (Scanner sc = new Scanner(System.in)) {

            // take input values from the user
            System.out.println("Enter the the 10 elements of the array: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            // Enter the elements that you want to search
            System.out.println("Enter the number that you want to search: ");
            int search = sc.nextInt();

            // Binary Search with O(log n) run time
            while (left <= right) {
                int mid = (left + right) / 2;
                if (array[mid] == search) {
                    System.out.println("Element found at index: " + mid);
                    return mid;
                } else if (array[mid] < search) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println("Element not found in the array.");
            return -1;
        }
    }

    public static void main(String[] args) {
        searching(args);
    }
}
