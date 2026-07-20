// Binary Tree in java
// Node class
import java.util.*;
import java.util.LinkedList;
class Node{
    int data; // value to be inserted in the node 
    Node left, right;
    Node(int data){
	this.data = data;
	this.left = null;
	this.right = null;
    }
}


class BinaryTree {
    Node root;
    
    void addNodes(int data) {
	root = AddNodesRecursively(root, data);
    }
    Node AddNodesRecursively(Node root, int data){
	if (root == null) return new Node(data); // 45
	if (data < root.data){
		root.left = AddNodesRecursively(root.left, data);
	} else {
		root.right = AddNodesRecursively(root.right, data);
	}
	return root;
    }
    void display(){
	System.out.println("Tree Traversal: ");
	System.out.print("Deapth first Search: ");
	DFS(root);
	System.out.println();
	System.out.print("Breadth frist Search: ");
	BFS(root);
    }
    void DFS(Node root){
	if (root == null) return;
	var stack = new Stack<Node>();
	stack.push(root);
	while(!stack.isEmpty()){
		Node curr = stack.pop();
		System.out.print(curr.data + " ");
		if (curr.right != null) stack.push(curr.right);
		if (curr.left != null) stack.push(curr.left);
	}
    }
    void BFS(Node root){
	if (root == null) return;
	
	var queue = new LinkedList<Node>();
	queue.offer(root);
	while(!queue.isEmpty()) {
		Node curr = queue.poll();
		System.out.print(curr.data + " "); 
		if (curr.left != null) queue.offer(curr.left);
		if (curr.right != null) queue.offer(curr.right);
	}
    }
    void main(){
	var bst = new BinaryTree();
	 int[] values = {50, 30, 70, 20, 40, 60, 80}; 
	for(int value : values){
		bst.addNodes(value);
	}
	bst.display();
    }
}
