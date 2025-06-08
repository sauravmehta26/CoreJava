public class Star2 {
// * * *
//  * * 
// * * *
//  * * 
      public static void main(String[] args) {
        int n=4;
        for(int i = 1; i <=n; i++) {
            for(int j=1; j<=n+1; j++){
                 if(i%2 != 0 && j%2 == 0){
                    System.out.print(" ");
                 }else if(i%2 == 0 && j%2 !=0){
                    System.out.print(" ");
                 }else 
                    System.out.print("*");
            }
            System.out.println();
    }
    
}
}
