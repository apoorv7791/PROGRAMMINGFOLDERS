#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};
struct Node *createNode(int data)
{
    struct Node *node = (struct Node *)malloc(sizeof(struct Node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

int main()
{
    struct Node *root = createNode(10);
    root->left = createNode(5);
    root->right = createNode(15);
    root->left->left = createNode(3);
    root->left->right = createNode(7);
    root->right->left = createNode(12);
    root->right->right = createNode(18);

    printf("Root: %d\n", root->data);
    printf("Left child of root: %d\n", root->left->data);
    printf("Right child of root: %d\n", root->right->data);
    printf("Left child of left child of root: %d\n", root->left->left->data);
    printf("Right child of left child of root: %d\n", root->left->right->data);
    printf("Left child of right child of root: %d\n", root->right->left->data);
    printf("Right child of right child of root: %d\n", root->right->right->data);

    return 0;
}