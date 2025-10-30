// implement a tree using linked list

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        this.root = null;
    }

    // an insert method in which we will add a new node
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            while (true) {
                if (data < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    // tree traversal

    // inorder traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // preorder traversal
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // postorder traversal
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void display() {
        System.out.println("Tree: ");
        System.out.println("Before Traversal: ");
        System.out.println("Root Element is : " + root.data);
        System.out.println();
        System.out.println("Inorder traversal: ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        postorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.display();
    }
}
