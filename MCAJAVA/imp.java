public class imp {
    int s[] = new int[100]; // size of the stack
    int top = -1; // top of the stack

    public void push(int data) { // A push function to add an element to the stack
        if (top == s.length - 1) { // if there is no space for adding the elements 
            System.out.println("Stack ovreflow"); // print this message
        } else {
            top++; // continue with the incrementation
            s[top] = data; // set the stack with the data
        }
    }

    public void pop() { // A pop function which removes the element from the top of the stack
        if (top == -1) { // if there is no element to take 
            System.out.println("Stack underflow"); // print this message 
        } else { // otherwise 
            top--; // we know that there are elements to delete
        }
    }

    public void peek() { // we are looking at the top element in the stack
        if (top == -1) { // if there are no elements in the stack
            System.out.println("Stack is empty"); // print this message
        } else { // if the stack is not empty 
            System.out.println("Peek element is " + s[top]); // then there is an element that we can see
        }
    }

    public void display() { // showing all elements 
        if (top == -1) { // if the top is empty
            System.out.println("Stack is empty"); // print this message
        } else { // otherwise
            for (int i = top; i >= 0; i--) { // start iterating elements from the top of the stack
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
