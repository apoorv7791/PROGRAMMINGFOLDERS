// Linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Remove {
    Node head;

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

    public void remove(int data) {
        // Handle empty list
        if (head == null) {
            return;
        }

        // Handle case where head node needs to be removed
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        // Traverse the list while checking the next node
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Remove r = new Remove();
        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.display();
        r.remove(2);
        r.display();
    }
}
