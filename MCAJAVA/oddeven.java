class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class oddEven {
    Node head;

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    public Node findOddEven() {
        Node odd = head;
        Node even = head != null ? head.next : null;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        if (odd != null) {
            odd.next = evenHead; // Link the end of odd list to the head of even list
        }
        return head;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oddEven list = new oddEven();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println("Original List:");
        list.display();

        Node rearrangedHead = list.findOddEven();
        System.out.println("Rearranged List (Odd-Even):");
        while (rearrangedHead != null) {
            System.out.print(rearrangedHead.data + " ");
            rearrangedHead = rearrangedHead.next;
        }
        System.out.println();
        System.out.println("Final List:");
        list.display();
    }
}