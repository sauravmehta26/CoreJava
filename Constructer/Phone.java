public class Phone {
    static int count=0;
    Phone(){
        count++;
    }
    public static void main(String[] args) {
        new Phone();
        new Phone();
        new Phone();
        System.out.println(count++);
    }
    
}
