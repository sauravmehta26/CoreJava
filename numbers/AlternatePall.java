import java.util.Scanner;
public class AlternatePall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int s = sc.nextInt();
        int e = sc.nextInt();
        int count=0;
        for(int i=s;i<=e;i++){
            if(ispall(i)){
                count++;
            if(count%2 != 0){
                System.out.println(i+" is pallindrome");
            }
            }
        }
        sc.close();

    }
    public static boolean ispall(int n){
        int o=n;
        int rev =0;
        while(n>0){
            int bit=n%10;
            rev=rev*10+bit;
            n/=10;
        }
        return rev == o;
    }
}