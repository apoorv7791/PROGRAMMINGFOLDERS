// program to implement a queue using array
public class q {
    int queue[] = new int[5];
    int front = 0;
    int rear = 0;

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
        rear--;
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
    }

    public void display() {
        for (int i = 0; i < rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        q obj = new q();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.dequeue();
        obj.display();
    }

}
