public class NumSnack {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                int num=((i-1)*n+1);
            for(int j=1;j<=n;j++){
                System.out.print(num++ +" ");
            }
        }else{
        int num=i*n;
        for(int j=1;j<=n;j++){
                System.out.print(num-- +" ");
            }
        }
        System.out.println();

    }
    }
}
