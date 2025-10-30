
// given an array of distinct integers, return all possible permutations.
// input: [1,2,3]
// output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class perm {
    public static void permmute(int arr[], int l, int r, List<int[]> results) {
        // base case to know when to stop
        if (l == r) {
            results.add(Arrays.copyOf(arr, arr.length));
            return;
        }
        // recursion to find the permutations
        for (int i = l; i <= r; i++) {
            // swap the solutions to find the permutations
            int temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
            // call the permmute function and swap the elements
            permmute(arr, l + 1, r, results);
            temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        List<int[]> results = new ArrayList<>();
        permmute(arr, 0, n - 1, results);
        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }
    }
}

// Time complexity: O(n*n!)
// Space complexity: O(n)
// explanation:
// we are using recursion to find the permutations of the array.
// we are using a temp variable to swap the elements of the array.
// we are using a count variable to keep track of the number of permutations.
// and a base case to return the number of permutations.