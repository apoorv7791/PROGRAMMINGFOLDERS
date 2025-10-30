//  Reverse an array without using any other array. A simple temp variable can be used?
class placement1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array is: " + java.util.Arrays.toString(array));
    }
}