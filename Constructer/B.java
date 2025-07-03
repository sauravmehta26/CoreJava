public class B {
   int i;
   int j;
   B(int i, int j){
    this.i=i;
    this.j=j;
   } 
   public static void main(String[] args) {
    B b1 = new B(10,20);
    B b2 = new B(30,40);
    System.out.println(b1.i+"\t"+b1.j);
    System.out.println(b2.i+"\t"+b2.j);
   }
}
