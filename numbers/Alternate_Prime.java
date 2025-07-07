import java.util.Scanner;

public class Alternate_Prime {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range:");
    int s=sc.nextInt();
    int e=sc.nextInt();
    int count =0;
    //if(int i<=1)continue;
    for(int i=e;i>=s;i--){
        if(i<=1)continue;
        boolean flag=true;
        for(int j=2;j<=i/2;j++){
        if(i%j==0){
            flag=false;
            break;
        }
    }
        if(flag){
            count++;
            if(count%2!=0)
            System.out.println(i);
        }

    }

    
}
}
