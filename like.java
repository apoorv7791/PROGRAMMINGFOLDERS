// creating a linked list

// creating a node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class like {
    // creating a head node for the linked list
    Node head;

    // an insert method in which we will add a new node
    public void insert(int data) {
        // creating a new node
        Node newNode = new Node(data);
        // if the head node is empty
        if (head == null) {
            // adding the new node
            head = newNode;
        } else {
            // if the head node is not empty then adding the new node in a the end
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traversing to the last node
            }
            temp.next = newNode;
        }
    }
    // a display method to print the linked list

    public void display() {
        // temp will be used for displaying the firsr node
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Reverse() { // reversing the linked list
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        like l = new like();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
        l.Reverse();
        l.display();
    }
}