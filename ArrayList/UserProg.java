public class UserProg {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("C");
        list.add("C");

        System.out.println("Size: " + list.size());  // 3
        System.out.println("First element: " + list.get(0)); // A

        list.remove(1);
        System.out.println("After remove: " + list.get(1)); // C

        list.add("X", 1);
        System.out.println("After insert: " + list.get(1)); // X
        System.out.println(list.get(0));
        System.out.println(list.get(9));
    }
}
