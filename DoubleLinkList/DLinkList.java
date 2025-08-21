class DLinkList{
    Node head;
    int count=0;

    public void add(Object ele){
        Node n=new Node(ele);
        if(head==null){
            head=n;
            count++;
            return;
        }
        Node curr = head;
        while(curr.next!=null) curr = curr.next;
            curr.next=n;
            n.prev=curr;
            count++;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.ele + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public void removeFirst() {
        head = head.next;
            head.prev = null;
        count--;
       
    }
    public void remove(int i){
        if(i<0||i>=size())throw new IndexOutOfBoundsException("Invalid index: " + i);
        if(i==0){
            removeFirst();
            return;
        }
        Node curr = head;
        for(int j=1;j<i;j++)curr=curr.next;
        curr.next.prev=curr;
        curr.next=curr.next.next;
        count--;
    }
    
    
}