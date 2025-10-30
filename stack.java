
// use of stack
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Stack: " + s);
        System.out.println("Top element: " + s.peek());
        s.pop();
        System.out.println("Stack after pop: " + s);
        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println("Size of stack: " + s.size());
        System.out.println("Stack contains 3? " + s.contains(3));
        System.out.println("Stack elements: ");
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }
}