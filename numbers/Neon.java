import java.util.Scanner;
public class Neon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sq = n*n;
        int sum=0;
        while(sq>0){
            int r = sq%10;
            sum+=r;
            sq/=10;
        }
        if (sum==n)System.out.println(n+" number is neon");
        else System.out.println("not neon");
    }

}