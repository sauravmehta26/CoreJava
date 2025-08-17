public class UserProgram{
    public static void main(String []args){
        LinkList l =new LinkList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.display();
        System.out.println(l.isEmpty());
        System.out.println(l.size()+"\n----"+l.get(4));
        l.get(4);
    }
}