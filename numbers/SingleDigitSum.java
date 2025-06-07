import java.util.Scanner;
public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
            if (n==0 && s>9){
               n=s;
               s=0;
            }
        }
            System.out.println(s);
   
    }
}
