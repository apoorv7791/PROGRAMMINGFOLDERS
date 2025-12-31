// Java 25 style linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        var temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void reverse() {
        Node prev = null;
        var current = head;
        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void display() {
        var temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        var list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
        list.reverse();
        list.display(); // 5 -> 4 -> 3 -> 2 -> 1 -> null
    }
}
