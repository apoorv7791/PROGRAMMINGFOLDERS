public class Trip {
    void main() {
        var s = "Hello World";
        var rev = "";
        for (var i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
