// implement a queue using array
public class que {
    // initialize variables front and rear
    int front = 0;
    int rear = 0;
    int queue[] = new int[5]; // initialize array

    // method to enqueue meaning adding an element
    public void enqueue(int data) {
        if (front == 0 && rear == 0) {
            queue[front] = data;
            front++;
            rear++;
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1]; // Shift all elements one position to the left
        }
        rear--; // Decrease the rear index by 1
        queue[rear] = 0; // Optional: Clear the last element
    }

    public void peek() {
        System.out.println("Element at the front is " + queue[front]);
        System.out.println("Element at the rear is " + queue[rear]);
    }

    public void display() {
        for (int i = 0; i < rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        que q = new que();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.peek();
        q.display();
    }
}
