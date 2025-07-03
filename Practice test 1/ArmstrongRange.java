import java.util.Scanner;
public class ArmstrongRange {
    public static void main(String[] args){
        System.out.println("enter the range to check");
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int e =sc.nextInt();
        int len;
        for(int i=s;i<=e;i++){
            len=length(i);
            if(isarmstrong(i,len)){
                System.out.println(i+" is armstrong");
            }
        }
        
    }
    public static int length(int n){
        int len=0;
        while(n>0){
            n=n/10;
            len++;
        }
        return len;
    }
    public static boolean isarmstrong(int n,int length){
        int o=n;
        int sum=0;
        int ld;
        while(n>0){
        ld=n%10;
        sum+=Math.pow(ld,length);
        n=n/10;
        }
        return sum==o;
    }
}

