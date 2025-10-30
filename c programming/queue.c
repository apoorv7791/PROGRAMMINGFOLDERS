#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#define MAX 100
int queue[MAX];

int front = -1;
int rear = -1;

void enqueue(int data)
{
    if (front == 0 && rear == MAX - 1)
    {
        printf("Queue is full\n");
        queue[front] = data;
        front++;
        rear++;
    }
    else
    {
        queue[rear] = data;
        rear++;
    }
}

void dequeue()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        printf("Dequeued element: %d\n", queue[front]);
        front++;
    }
}

void display()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        printf("Queue elements: ");
        for (int i = front; i < rear; i++)
        {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}

int main()
{
    enqueue(10);
    enqueue(20);
    enqueue(30);
    enqueue(40);
    enqueue(50);
    enqueue(60);
    display();
    dequeue();
    display();
    return 0;
}