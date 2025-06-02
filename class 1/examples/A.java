package examples;
public class A {
    public static void main(String[] args) {
        System.out.println("hello hi bye bye");
        A.m1();
        B.m1();
        // D.main(10);
        C.m1();   
    }
    public static void m1() {
        System.out.println("Hello, i am A.m1()");
    }  
}
class B {
    public static void m1()
    {
        System.out.println("m1() in class B");
    }
}
