public class d {
    public static void main(String[] args) {
        int n=5;
        int x=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                // x=i*n-5;
                for(int j=1;j<=n;j++){
                    System.out.print(x+++" ");
                    // x++;
                }
            }
            else
            {
                // int y=x+i-1;
             x=i*n;
                for(int j=1;j<=n;j++){
                    System.out.print(x+" ");
                    x--;
                }
                x=(i+1)*n-4;//ye lo
            }
            System.out.println();
        }
        
    
    
}
}