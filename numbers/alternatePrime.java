import java.util.Scanner;
public class alternatePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int s=sc.nextInt();
        int e=sc.nextInt();
        int count=0;
        for(int i=s;i<=e;i++){
            if(isprime(i)){                
                count++;
                if(count%2!=0){
                System.out.print( i+"\t");
                }
            }
        }
    }
    public static boolean isprime(int n){
            if(n<=1) return false;
            for(int j=2;j<=n/2;j++){
                if(n%j==0) return false;
            }
            return true;
    }
}
