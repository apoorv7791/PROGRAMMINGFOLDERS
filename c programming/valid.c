// how to implement a two stack in a single array

#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int stack[MAX];
int top1 = -1;
int top2 = MAX;
int stack1[MAX];
int stack2[MAX];
void push1(int data) // push to stack 1 if there is space
{
    if (top1 == top2 - 1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        stack[++top1] = data;
    }
}
void push2(int data) // push to stack 2 if there is space
{
    if (top2 == top1 + 1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        stack[--top2] = data;
    }
}
void pop1()
{
    if (top1 == -1)
    {
        printf("Stack Underflow\n");
    }
    else
    {
        printf("Popped element: %d\n", stack[top1--]);
    }
}
void pop2()
{
    if (top2 == MAX)
    {
        printf("Stack Underflow\n");
    }
    else
    {
        printf("Popped element: %d\n", stack[top2++]);
    }
}
void peek1()
{
    if (top1 == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Top element: %d\n", stack[top1]);
    }
}
void peek2()
{
    if (top2 == MAX)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Top element: %d\n", stack[top2]);
    }
}
void display1()
{
    if (top1 == -1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top1; i >= 0; i--)
        {
            printf("%d\n", stack[i]);
        }
    }
}
void display2()
{
    if (top2 == MAX)
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top2; i < MAX; i++)
        {
            printf("%d\n", stack[i]);
        }
    }
}
int main()
{
    int choice, data;
    while (1)
    {
        printf("1. Push to Stack 1\n");
        printf("2. Push to Stack 2\n");
        printf("3. Pop from Stack 1\n");
        printf("4. Pop from Stack 2\n");
        printf("5. Peek Stack 1\n");
        printf("6. Peek Stack 2\n");
        printf("7. Display Stack 1\n");
        printf("8. Display Stack 2\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter data: ");
            scanf("%d", &data);
            push1(data);
            break;
        case 2:
            printf("Enter data: ");
            scanf("%d", &data);
            push2(data);
            break;
        case 3:
            pop1();
            break;
        case 4:
            pop2();
            break;
        case 5:
            peek1();
            break;
        case 6:
            peek2();
            break;
        case 7:
            display1();
            break;
        case 8:
            display2();
            break;
        case 9:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
    return 0;
}