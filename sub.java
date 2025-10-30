// longest substring without repeating characters
// Given a string s, find the length of the longest substring without repeating characters. 
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

import java.util.HashSet;

class sub {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        while (i < s.length()) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(i));
                maxlen = Math.max(maxlen, i - left + 1);
                i++;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        sub obj = new sub();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s)); // Output: 3
    }
}