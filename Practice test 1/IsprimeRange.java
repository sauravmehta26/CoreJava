import java.util.Scanner;
public class IsprimeRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int s =sc.nextInt();
        int e =sc.nextInt();
        for(int i=s;i<=e;i++){
            if(isprime(i))System.out.println(i+"   is prime no");
        }
    }
    public static boolean isprime(int n){
        if(n<2)return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
