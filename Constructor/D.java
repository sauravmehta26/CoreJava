public class D {
    D(){
        System.out.println("D()-cons");
    }
    D(int i){
        System.out.println("D(int i) :"+i);
    }
    D(int i,int j){
        System.out.println("D(int i) :"+i+"\t"+j);
    }
    public static void main(String[] args) {
        new D();
        new D(10);
        new D(20, 30);
    }
}
