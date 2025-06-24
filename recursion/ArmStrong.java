import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        int sum= 0;
        System.out.println(armstrong(n,sqr,sum));

    }
       public static boolean armstrong(int n,int sqr,int sum){
            if(sqr == 0)return sum==n;
            sum+=sqr%10;
            return armstrong(n,sqr/10,sum);

        } 
}

