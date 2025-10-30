public class insert {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// explanation of the code
// insertion sort works by looping over the array and comparing
// each element with all the elements before it. If the element
// is smaller than the element before it, it is swapped with it.
// This process continues until the smallest element is found.
// Then the next element is compared with all the elements before
// it in the same way, and so on. At the end of the loop, the
// array is sorted in ascending order.
