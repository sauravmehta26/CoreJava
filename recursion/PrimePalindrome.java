import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n = sc.nextInt();

        if (isPrime(n, n / 2) && isPalindrome(n, 0, n)) {
            System.out.println(n + " is a prime palindrome.");
        } else {
            System.out.println(n + " is NOT a prime palindrome.");
        }
    }
    public static boolean isPalindrome(int n,int rev,int o) {
        if(n==0) return rev==o;
        rev = (rev*10)+(n%10);
        return isPalindrome(n/10,rev,o);
    }
    public static boolean isPrime(int n,int half){
        if(half==1) return true;
        if(n<=1 || n%half == 0) return false;
        return isPrime(n,half-1);
    }
}