class Cat {
    int j;

    Cat(int j) {
        this.j = j;
    }
}

public class Dog implements Cloneable {
    Cat c;
    int i;

    public Dog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }

   

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c1 = new Cat(20);
        Dog d1 = new Dog(c1, 10);
        System.out.println(d1.i + "---------------" + d1.c.j);

        Dog d2 = (Dog) d1.clone(); // Shallow copy
        d2.i = 888;
        d2.c.j = 999; // This will affect both d1 and d2 because c is shared

        System.out.println(d1.i + "---------------" + d1.c.j); // d1.i is 10, d1.c.j is now 999
        System.out.println(d2.i + "---------------" + d2.c.j); // d2.i is 888, d2.c.j is 999
    }
}
 


