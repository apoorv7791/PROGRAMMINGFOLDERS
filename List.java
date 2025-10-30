import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node fast;
    Node slow;

    List(Node head) {
        this.fast = head;
        this.slow = head;
    }

    public void hasCycle() {
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("Cycle is present");
                return;
            }
        }
        System.out.println("Cycle is not present");
    }

    public void display() {
        Node temp = fast; // Start from the head of the list
        Set<Node> visited = new HashSet<>();
        while (temp != null) {
            if (visited.contains(temp)) {
                System.out.print(temp.data + "->");
                System.out.println("cycle detected");
                return;
            }
            System.out.print(temp.data + "->");
            visited.add(temp);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        List l = new List(new Node(1));
        l.fast.next = new Node(2);
        l.slow.next = new Node(3);
        l.fast.next.next = new Node(4);
        l.slow.next.next = new Node(5);
        l.fast.next.next.next = new Node(6);
        l.slow.next.next.next = new Node(7);
        l.fast.next.next.next.next = l.slow.next;
        l.hasCycle();
        l.display();
    }
}