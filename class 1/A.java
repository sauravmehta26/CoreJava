class A{
    public static void main(String[] args){
        System.out.println("hello hi bye bye");
        B.m1();
        C.m1();
        // D.main(10);
        E.m1();
    }
}
class C{
    public static void m1(){
        System.out.println("Hello, i am A.m2");
    }
}

