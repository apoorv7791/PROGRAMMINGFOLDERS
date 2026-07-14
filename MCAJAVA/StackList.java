// build stack throguth linkedlist



class Node{
    int data;
    Node next; // reference for next node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class StackList {
    Node top;
    void push(int data){
        var newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }
    void pop(){
        if (top == null) throw new RuntimeException("List is Empty");
        top = top.next;
    }
    boolean search(int pick){
        var curr = top;
        while(curr != null){
            if (curr.data == pick){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    void display(){
        var current = top;
        while(current != null){ 
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    void main(){
        var slist = new StackList();
        slist.push(1);
        slist.push(2);
        slist.push(3);
        slist.push(4);
        slist.push(5);
        slist.display();
        System.out.println(slist.search(5));
    }
}