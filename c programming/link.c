// program to implement a LinkedList
#include <stdio.h>
#include <stdlib.h>

struct Node // structure for a node
{
    int data;
    struct Node *next;
};

struct LinkedList
{
    struct Node *head;
    struct Node *tail;
};

struct LinkedList *linkedList;

void createNode() // we are creating a the node of the linkked list
{
    linkedList = (struct LinkedList *)malloc(sizeof(struct LinkedList));
    linkedList->head = NULL;
    linkedList->tail = NULL;
}

void insertNode(int data) // inserting a node in the linked list
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    if (linkedList->head == NULL)
    {
        linkedList->head = newNode;
        linkedList->tail = newNode;
    }
    else
    {
        linkedList->tail->next = newNode;
        linkedList->tail = newNode;
    }
}

void deleteNode()
{
    if (linkedList->head == NULL)
        return; // Check if the list is empty
    struct Node *temp = linkedList->head;
    linkedList->head = linkedList->head->next;
    free(temp);
}

void displayNode()
{
    struct Node *temp = linkedList->head;
    while (temp != NULL)
    {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
}

// how can i reverse this linked list
void Reverse(struct Node **head)
{
    struct Node *prev = NULL;
    struct Node *current = *head;
    struct Node *next = NULL;
    while (current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    *head = prev;
}

// deleting from the last
void deletefromLast()
{
    if (linkedList->head == NULL)
        return; // Check if the list is empty

    struct Node *temp = linkedList->head;
    struct Node *prev = NULL;

    if (temp->next == NULL) // Check if the list has only one node
    {
        linkedList->head = NULL;
        free(temp);
        return;
    }

    while (temp->next != NULL)
    {
        prev = temp;
        temp = temp->next;
    }
    prev->next = NULL;
    free(temp);
}

int main()
{
    createNode();
    insertNode(10);
    insertNode(20);
    insertNode(30);
    insertNode(40);
    insertNode(50);
    deletefromLast();
    Reverse(&linkedList->head);
    displayNode();
    return 0;
}