// implement queue using linked list

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};
struct Queue
{
    struct Node *front;
    struct Node *rear;
};

struct Queue *createQueue()
{
    struct Queue *q = (struct Queue *)malloc(sizeof(struct Queue)); // Assigning a memory block for the node
    q->front = NULL;
    q->rear = NULL;
    return q;
}
void enqueue(struct Queue *q, int data) // add an element from the rear of the queue
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    if (q->rear == NULL)
    {
        q->front = newNode;
        q->rear = newNode;
        return;
    }
    q->rear->next = newNode;
    q->rear = newNode;
}

int dequeue(struct Queue *q) // remove an element from the front of the queue
{
    if (q->front == NULL)
    {
        printf("Queue is empty\n");
        return -1;
    }
    struct Node *temp = q->front;
    int data = temp->data;
    q->front = q->front->next;
    if (q->front == NULL)
    {
        q->rear = NULL;
    }
    free(temp);
    return data;
}

void display(struct Queue *q) // display the elements of the queue
{
    if (q->front == NULL)
    {
        printf("Queue is empty\n");
        return;
    }
    struct Node *temp = q->front;
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main()
{
    struct Queue *q = createQueue();
    enqueue(q, 10);
    enqueue(q, 20);
    enqueue(q, 30);
    enqueue(q, 40);
    enqueue(q, 50);
    enqueue(q, 60);
    printf("Queue elements: ");
    display(q);
    printf("Dequeued element: %d\n", dequeue(q));
    printf("Queue elements after dequeue: ");
    display(q);
    return 0;
}