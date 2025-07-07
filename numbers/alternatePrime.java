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
                if(count%2!=0){
            System.out.print( i+"\t");

                }
                        count++;

            }
        }

    }
    public static boolean isprime(int n){
            for(int j=2;j<=n/2;j++){
                if(n%j==0) return false;
            }
            return true;
    }
}
