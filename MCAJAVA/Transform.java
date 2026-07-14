
// input : s = "java9";
// output: "nineavaj";

// map = { '0': "zero", '1': "one", '2': "two", '3': "three", '4': "four", '5':
// "five", '6': "six", '7': "seven", '8': "eight", '9': "nine" }
// if map has a key in s, replace it with the value and reverse the string

import java.util.*;

class Transform {
    void main() {
        var s = "java9";
        var rev = "";
        var map = new HashMap<Character, String>();
        map.put('0', "zero");
        map.put('1', "one");
        map.put('2', "two");
        map.put('3', "three");
        map.put('4', "four");
        map.put('5', "five");
        map.put('6', "six");
        map.put('7', "seven");
        map.put('8', "eight");
        map.put('9', "nine");
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                rev += map.get(c);
            } else {
                rev += c;
            }
        }
        System.out.println(rev); // Output: "nineavaj"
    }
}