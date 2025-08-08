import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int i=1;
        // while(n>0){
        //     n-=i;
        //     i+=2;
        // }
        for(;n>0;n-=i,i+=2);
            System.out.println(n==0?"perfect Sqr":"Not Perfect Square");
        
    }
    
}
