// a node class
class Node {
    int data;
    Node next;

    Node(int data) {
        // this keyword is used to refer to the current object
        this.data = data;
        this.next = null;
    }
}

class linked {
    Node head; // initializing head

    // an insert method in which we will add a new node
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else { // if the head is not null then adding the new node in a the end
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // reversing the linked list
    public void Reverse() {
        // three pointers are used
        Node prev = null;
        Node Current = head;
        Node next = null;
        while (Current != null) {
            next = Current.next;
            Current.next = prev;
            prev = Current;
            Current = next;
        }
        head = prev;
    }

    public void display() {
        Node temp = head; // make temp point to the head which will display the linked list from the list
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linked l = new linked();
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