// valid parenthesis
// Given a string s = "()" return true if the string is valid
// each opening bracket will be closed with it's correspoding type bracket
// input = s = "[()]" 
// output = true;

import java.util.*;

class Transcend{
    public boolean isValid(String s){
        var stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if (c == '(' ||  c == '[' || c == '{'){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char t = stack.pop();
                if (c == ')' && t != '(' || c == ']' && t != '[' || c == '}' && t != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        var tran = new Transcend();
        var s = "([])";
        System.out.println(tran.isValid(s));
    }
}
