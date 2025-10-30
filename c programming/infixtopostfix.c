// C program to convert infix expression to postfix expression using stack

#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
#define MAX 100 //
char stack[MAX];
int top = -1;
void push(char c)
{
    if (top == MAX - 1)
    {
        printf("Stack overflow\n");
        return;
    }
    stack[++top] = c;
}
char pop()
{
    if (top == -1)
    {
        printf("Stack underflow\n");
        return '\0';
    }
    else
    {
        return stack[top--];
    }
}

int precedence(char c)
{
    switch (c)
    {
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 2;
    case '^':
        return 3;
    default:
        return 0;
    }
}
int main()
{
    char infix[MAX], postfix[MAX];
    int i, j = 0;
    printf("Enter an infix expression: ");
    fgets(infix, sizeof(infix), stdin);
    infix[strcspn(infix, "\n")] = 0; // Remove newline character
    for (i = 0; infix[i]; i++)
    {
        if (isalnum(infix[i]))
        {
            postfix[j++] = infix[i];
        }
        else if (infix[i] == '(')
        {
            push(infix[i]);
        }
        else if (infix[i] == ')')
        {
            while (top != -1 && stack[top] != '(')
            {
                postfix[j++] = pop();
            }
            pop(); // Pop the '('
        }
        else
        {
            while (top != -1 && precedence(stack[top]) >= precedence(infix[i]))
            {
                postfix[j++] = pop();
            }
            push(infix[i]);
        }
    }
    while (top != -1)
    {
        postfix[j++] = pop();
    }
    postfix[j] = '\0';
    printf("Postfix expression: %s\n", postfix);
    return 0;
}