class Node{
    
    Node next;
    Object ele;
    Node prev;
    Node(Object ele){
        this.ele=ele;
    }
    Node(Object ele,Node next,Node prev){
        this.next=next;
        this.prev=prev;
        this.ele=ele;
    }
}