import java.util.Scanner;
public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int s=n*n;
        boolean flag=true;
        while(n>0){
            if (n%10 != s%10){
                flag=false;
                break;
            }
            n/=10;
            s/=10;
        }
        if(flag){
            System.out.println("automorphic");
        }else
        System.out.println("not auto");
    }
}
// 5 25
// 6 36 
// 7 49 wrong
// 25 225 ending with 25 wright
