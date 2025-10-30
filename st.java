// implement a stack using array
public class st {
    int stack[] = new int[5];
    int top = -1;

    public void push(int data) {
        if (top == 4) {
            System.out.println("stack overflow");
        } else {
            top++;
            stack[top] = data;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack underflow");
        } else {
            top--;
        }
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("Element at index " + i + " is " + stack[i]);
        }
    }

    public void peek() {
        System.out.println(stack[top]);
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("stack is not empty");
        }
    }

    public static void main(String[] args) {
        st s = new st();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.pop();
        s.display();
        s.peek();
        s.display();
        s.isEmpty();
        s.display();
    }
}