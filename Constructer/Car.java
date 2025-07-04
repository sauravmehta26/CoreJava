public class Car {
    static int i;
    
    i=1;//wrong
    
    int j=0;//correct
    int k;
    k=7;//wrong
    
    public static void main(String[] args) {
        Car b=new Car();
        System.out.println(i);
    }
    
}
