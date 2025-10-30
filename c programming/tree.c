// make a tree

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
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}
void insert(struct Node **root, int data)
{
    if (*root == NULL)
    {
        *root = createNode(data);
        return;
    }
    if (data < (*root)->data)
        insert(&(*root)->left, data);
    else
        insert(&(*root)->right, data);
}
void inorderTraversal(struct Node *root)
{
    if (!root)
        return;
    inorderTraversal(root->left);
    printf("%d ", root->data);
    inorderTraversal(root->right);
}

void preorderTraversal(struct Node *root)
{
    if (!root)
        return;
    printf("%d ", root->data);
    preorderTraversal(root->left);
    preorderTraversal(root->right);
}

void postorderTraversal(struct Node *root)
{
    if (!root)
        return;
    postorderTraversal(root->left);
    postorderTraversal(root->right);
    printf("%d", root->data);
}

void printTree(struct Node *root, int space)
{
    if (root == NULL)
        return;
    space += 10;
    printTree(root->right, space);
    printf("\n");
    for (int i = 10; i < space; i++)
        printf(" ");
    printf("%d\n", root->data);
    printTree(root->left, space);
}

int main()
{
    struct Node *root = NULL;
    insert(&root, 5);
    insert(&root, 3);
    insert(&root, 7);
    insert(&root, 2);
    insert(&root, 4);
    insert(&root, 6);
    insert(&root, 8);

    printf("Inorder Traversal: ");
    inorderTraversal(root);
    printf("\n");

    printf("Preorder Traversal: ");
    preorderTraversal(root);
    printf("\n");

    printf("Postorder Traversal: ");
    postorderTraversal(root);
    printf("\n");

    printf("Tree Structure:\n");
    printTree(root, 0);

    return 0;
}