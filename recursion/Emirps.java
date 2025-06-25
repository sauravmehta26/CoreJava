import java.util.Scanner;

public class Emirps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n = sc.nextInt();
        int o = n;
        int rev= 0;
        System.out.println(emirps(n,rev,o));
    }
    public static boolean emirps(int n,int rev,int o) {
        if(n==0) return rev==o;
        rev = (rev*10)+n%10;
        return emirps(n/10,rev,o);
    }
}
