import java.util.HashSet;

public class setter {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        for (int i : arr) {
            if (h.contains(arr[i])) {
                System.out.println("Duplicate element found: " + arr[i]);
            } else {
                h.add(arr[i]);
            }
        }
        System.out.println("Unique elements: " + h);
    }
}
