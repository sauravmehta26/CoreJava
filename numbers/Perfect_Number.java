import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        int n=153;
        int len=0;
        while(n>0){
            len++;
            n/=10;
        }
        System.out.println(len);
    }
    
}
