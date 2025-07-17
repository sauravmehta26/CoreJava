import java.util.Scanner;
public class Highest3rdArmstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int s = sc.nextInt();
        int e = sc.nextInt();
        int count=0;

        for(int i=e;i>=s;i--){
            if(isarmstrong(i)){count++;
            if(count ==3 ){
            System.out.println(i+" : is third highest armstrong");
            break;
        }
        }
        }
    }
     static boolean isarmstrong(int n){
            int l=0;
            int temp =n;
            int o=n;
            while(n>0){
                n/=10;
                l++;
            }
            int p = 0;
            while(temp>0){
                int r = temp%10;
                p+=Math.pow(r,l);
                temp/=10;
            }
            return p == o;
        
        }
}