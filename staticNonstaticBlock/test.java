class const_static_nonstatic{
    static int i=10;
    static{
       System.out.println("SB1");
}
{
    System.out.println("NSB1");
}
const_static_nonstatic()
    {
    System.out.println("cons");
}
}
public class test{
    static {
        System.out.println("SBT");
         new const_static_nonstatic();
    }
    {
        System.out.println("NSBT");
    }
    test(){
        System.out.println("TEST CALL");
    }
    public static void main(String[] args) {
        System.out.println("MAIN STARTS");
        //new test();
        System.out.println(const_static_nonstatic.i);
        System.out.println("MAIN ENDS");
    }
   

}