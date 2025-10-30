class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DoubleLinkedList {
    Node head;

    // insert method to add a new node at the begining or end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);
        dll.insert(5);
        dll.display(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}