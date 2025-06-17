public class Palindrome {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int s = n-i; s >= 1; s--){
                System.out.print("  ");
            }
            for(int j = 1; j <= i;j++){
                System.out.print(j+" ");
            }
            if(i>1){
            for(int j =i-1;j>=1;j-- ){
                System.out.print(j+" ");
            }
            }
            System.out.println();
        }
    }
    
}
