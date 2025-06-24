import java.util.Scanner;

public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        int sqr= n*n;
        System.out.println(isauto(n,sqr));
    }
       public static boolean isauto(int n,int sqr){
            if(n == 0)return true;
            if (n % 10 != sqr % 10) return false;
            return isauto(n/10,sqr/10);

        }
}
