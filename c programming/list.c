#include <stdio.h>
#define MAX 100

int stack[MAX];
int top = -1;

void push(int data)
{
    if (top == MAX - 1)
    {
        printf("Stack overflow\n");
    }
    else
    {
        stack[++top] = data;
    }
}

int pop()
{
    if (top == -1)
    {
        printf("Stack underflow\n");
        return -1;
    }
    else
    {
        return stack[top--];
    }
}

void peek()
{
    if (top == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Top element: %d\n", stack[top]);
    }
}

void display()
{
    if (top == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            printf("%d\n", stack[i]);
        }
    }
}

int main()
{
    push(10);
    push(20);
    push(30);
    display();
    printf("Popped element: %d\n", pop());
    peek();
    return 0;
}
