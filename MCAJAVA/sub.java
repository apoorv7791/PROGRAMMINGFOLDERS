// longest substring without repeating characters
// Given a string s, find the length of the longest substring without repeating characters. 
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

import java.util.HashSet;

class sub {
    public int lengthOfLongestSubstring(String s) {
        var left = 0;
        var right = 0;
        var maxLength = 0;
        var set = new HashSet<Character>();
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        sub obj = new sub();
        var s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s)); // Output: 3
    }
}
// technique used : Sliding window
