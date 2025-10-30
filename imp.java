public class imp {
    int s[] = new int[100];
    int top = -1;

    public void push(int data) {
        if (top == s.length - 1) {
            System.out.println("Stack ovreflow");
        } else {
            top++;
            s[top] = data;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peek element is " + s[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }

    public static void main(String[] args) {
        imp stack = new imp();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.peek();
        stack.display();
    }
}
