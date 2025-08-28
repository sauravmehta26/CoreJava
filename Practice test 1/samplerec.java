public class samplerec{
    public static void main(String[] args){
    int n = 1234;
    int sum = 0;
    System.out.print(reverse(8889098,0));
    }
    public static int reverse(int n,int sum){
    if (n==0)return sum;
     int r=n%10;
    sum *=10;
    return reverse(n/10,sum+r);
    }

}