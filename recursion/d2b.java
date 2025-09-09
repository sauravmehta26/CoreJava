public class d2b {
    public static void main(String[] args) {
        int n=6;
        System.out.println(d2b(n,0,1));
    }
    static int d2b(int n,int sum,int p){
        if(n==0) return sum;
        int rem = n%2;
        sum=sum+p*rem;
        return d2b(n/2,sum,p*10);
    }
}
