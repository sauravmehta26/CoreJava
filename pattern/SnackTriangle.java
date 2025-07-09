public class SnackTriangle {
    public static void main(String[] args) {
        int n=5;
        int x=1;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print(x+" ");
                    x++;
                }
            }else{
            int y=x+i-1;
            x=y+1;
            for(int j=1;j<=i;j++){
                System.out.print(y +" ");
                y--;
            }
        }
        System.out.println();
    }
    }
}
