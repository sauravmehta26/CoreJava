import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        int m = n;
        int sum= 0;
        int length=len(n,0);
        System.out.println(armstrong(n,length,sum,m));

    }
    public static int len(int n,int len){
       if(n==0) return len;
    //    return 1+len(n/10,len--);
              return len(n/10,len+1); 

        }
   
    
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static boolean armstrong(int n,int len,int sum,int m){
        if(n == 0)return sum==m;
        int r=n%10;
        sum+=power(r,len);
        return armstrong(n/10,len,sum,m);

    } 
}

