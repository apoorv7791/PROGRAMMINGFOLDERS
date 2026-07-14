public class red {
    public static void main(String[] args) {
        int num = 123;
        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
        System.out.println("The number has been reversed." + num);
    }
}
