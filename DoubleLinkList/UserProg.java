public class UserProg {
    public static void main(String[] args) {
        DLinkList list = new DLinkList();

        System.out.println("Is list empty? " + list.isEmpty());

        list.add("A");
        list.add(8888);
        list.add("C");

        System.out.println("After adding elements:");
        list.display();
        list.removeFirst();
        list.remove(1);
        list.display();

        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
