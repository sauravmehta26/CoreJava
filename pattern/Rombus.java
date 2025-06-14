public class Rombus {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n/2+1;i++){
            for(int s=n-n/2-i; s>=1;s--){
            System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
            }
            for(int i=1;i<=n/2;i++){
                for(int s=1; s<=i;s++){
                    System.out.print(" ");
            }
                for( int j =n-2*i; j >= 1;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        }
    