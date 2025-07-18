public class snackPattern{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            if(i%2 !=0){
                int s = (((i-1)*5)+1); 
                for(int j= 1;j<=n;j++){
                    System.out.print(s++ +" ");
                }
                System.out.println();
            }else {
                int s = i*5;
                for(int j= 1;j<=n;j++){
                    System.out.print(s-- +" ");
                }
                System.out.println();
            }
        }
    }
}