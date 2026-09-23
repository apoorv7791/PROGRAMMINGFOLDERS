class assessment {

    public String reversed(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev;
    }

    public boolean palindrome(String str) {
        return str.equals(reversed(str));
    }

    public boolean checkArrayIsPalindrome(String[] words) {

        for (String word : words) {
            if (!palindrome(word)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        assessment obj = new assessment();

        String[] words = {"madam", "racecar", "level"};

        System.out.println(obj.checkArrayIsPalindrome(words));
    }
}
