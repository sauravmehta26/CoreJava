public class SnackTriangle{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                int num=(i*(i+1))/2;
                for(int j=1;j<=i;j++){
                    System.out.print(num--+" ");
                }
            }else{
                int num=i*(i-1)/2+1;
                for(int j=1;j<=i;j++){
                    System.out.print(num+++" ");
                }
            }
            System.out.println();
               
        }
    }
}