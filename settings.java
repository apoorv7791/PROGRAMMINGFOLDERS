// use hashset to find the unique elements in an array

import java.util.HashSet;

public class settings {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println("Found the unique elements in the array" + set);
    }
}
// explanation
// we are finding the unique elements in an array using hashset
// we are using a for loop to iterate over the array
// we are using a hashset to store the unique elements
// we are using a if statement to check if the element is already in the hashset
// if the element is already in the hashset, we are printing the element
// if the element is not in the hashset, we are adding the element to the
// hashset
// end of the loop we are printing the unique elements in the array