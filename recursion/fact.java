public class fact {
    public static void main(String[] args) {
        int n= 0;
        System.out.println(fact(n));
    }
    static int fact(int n){
            if(n==0||n==1)return n;
            return n*fact(n-1);
        }
    
}
