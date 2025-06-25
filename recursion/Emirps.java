import java.util.Scanner;

public class Emirps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n = sc.nextInt();

        if (isEmirp(n)) {
            System.out.println(n + " is an emirp number.");
        } else {
            System.out.println(n + " is NOT an emirp number.");
        }
    }
        public static boolean isEmirp(int n) {
        if (!isPrime(n, n / 2)) return false;

        int rev = reverse(n,0);
        return rev != n && isPrime(rev, rev / 2);
    }
    public static boolean isPrime(int n,int half){
        if(half==1) return true;
        if(n<=1 || n%half == 0) return false;
        return isPrime(n,half-1);
    }
    public static int reverse(int n,int rev){
        if(n == 0) return rev;
        rev=(rev*10)+(n%10);
        return reverse(n/2,rev);
    }
}
