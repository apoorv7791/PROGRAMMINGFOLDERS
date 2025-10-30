public class placement4 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int n = array.length + 1;
        int total = n * (n + 1) / 2;
        int missing = total - sum;
        if (missing == 0) {
            System.out.println("No number is missing");
        } else {
            System.out.println("Missing number is: " + missing);
            for (int i = 0; i < array.length; i++) {
                if (array[i] > missing) {
                    System.out
                            .println("Number " + missing + " is missing between " + array[i - 1] + " and " + array[i]);
                    break;
                }
            }
        }
    }
}
