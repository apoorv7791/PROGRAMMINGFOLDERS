// stack implementation using linked list
class Node {
    int data;
    Node next;
}

class s {
    Node head;

    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        head = head.next;
        if (head == null) {
            System.out.println("stack underflow");
        } else {
            System.out.println("Stack overflow");
        }
    }

    public void peek() {
        System.out.println("Peek element is " + head.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        s s1 = new s();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.display();
        s1.pop();
        s1.peek();
        s1.display();
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)