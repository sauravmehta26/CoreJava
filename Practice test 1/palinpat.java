//import java.net.SocketPermission;

public class palinpat{
    public static void main(String [] args){
    int n=5;
       for(int i=1;i<=5;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }if (i!=1){
            for(int j=i-1;j>=1;j--){
              System.out.print(j+" ");
            }
        }
        System.out.println();
    }
}
}