import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        int sqr = n*n;
        int sum= 0;
        System.out.println(neon(n,sqr,sum));
    }
       public static boolean neon(int n,int sqr,int sum){
            if(sqr == 0)return sum==n;
            sum+=sqr%10;
            return neon(n,sqr/10,sum);

        } 
}
