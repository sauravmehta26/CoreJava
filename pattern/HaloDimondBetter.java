public class HaloDimondBetter {
    public static void main(String[] args) {
        int n = 9;
        int str = 1;
        int sp = n/2;
        for(int i = 1;i <= n;i++){
            for(int j = 1; j <= sp+1;j++){
                System.out.print("*");
            }
            for (int j = 1; j <= str; j++) {
                    System.out.print(" ");  // For the middle line, print stars instead of spaces
       
            }
            for(int j = 1; j<=sp+1;j++){
                System.out.print("*");
            }
            // for(int k=1;k<=str;k++){
            //     System.out.print(" ");
            // }
            System.out.println();
            if(i<=n/2){
                sp--;
                str+=2;
            }else {
                sp++;
                str-=2;
            }
        }
    }
}
