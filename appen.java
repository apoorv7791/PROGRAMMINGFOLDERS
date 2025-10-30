// adding new elements in an array
public class appen {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.arraycopy(arr2, 0, arr3, arr.length, arr2.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
