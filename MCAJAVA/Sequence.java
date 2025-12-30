public class Sequence {
    Boolean isSubsequence(String s, String t) {
        var left = 0;
        var right = 0;
        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            right++;

        }
        return left == s.length();
    }

    void main() {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
