import java.util.Scanner;
public class Alternate_ArmstrongRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int s = sc.nextInt();
        int e = sc.nextInt();
        int count=0;

        for(int i =s;i<=e;i++){
            if(isarmstrong(i)){
                count++;
                if(count%2 !=0)
                System.out.println(i+" : is armstrong");
            }
        }
    }
        
        static boolean isarmstrong(int n){
            int sum=0;
            int temp=n;
            int o=n;
            int l=0;
            while(n>0){
                l++;
                n=n/10;
            }
            while (temp>0){
                int r = temp%10;
                sum+= Math.pow(r,l);
                temp /=10;
            }
            return sum == o;
        } 
      
    }
