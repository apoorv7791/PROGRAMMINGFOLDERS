//Write a java program to find smallest element from an array. Take an integer array with length 6, and the values are 6, 2, 3, 4, 5, 6.

import java.util.Scanner;

public class placement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);
        sc.close();
    }
}
