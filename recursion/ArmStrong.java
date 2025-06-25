import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        int m = n;
        int sum= 0;
        int length=len(n);
        System.out.println(armstrong(n,length,sum,m));

    }
    public static int len(int n){
        int l=0;
        while(n>0){
            n=n/10;
        l++;
        }
        return l;
    }
        public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
       public static boolean armstrong(int n,int len,int sum,int m){
            if(n == 0)return sum==m;
            int r=n%10;
            sum+=power(r,len);
            return armstrong(n/10,len,sum,m);

        } 
}

