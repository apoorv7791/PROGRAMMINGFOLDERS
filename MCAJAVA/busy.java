public class busy {
    void main() {
        int n = 5;
        String result = (n & 1) == 0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
// print whether a number is even or odd
// result : odd