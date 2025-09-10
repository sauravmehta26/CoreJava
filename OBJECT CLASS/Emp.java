public class Emp {
    String name;
    int id;
    double age;
    public static void main(String[] args) {
        Emp e1= new Emp();
        e1.name="A1";
        e1. id=1;
        e1.age=25.4;
        Emp e2 = e1;
        e2.name="A2";
        Emp e3 = new Emp();
        e3.name="A3";
        System.out.println(e1.name+"\t"+e1.age+"\t"+e1.id);
        System.out.println(e2.name+"\t"+e2.age+"\t"+e2.id);
        System.out.println(e3.name+"\t"+e3.age+"\t"+e3.id);

    }
}
