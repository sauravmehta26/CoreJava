public class RevHaloT {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0;
        int st = 2*n-1;
        for(int i = 1;i <= n;i++){
            for(int s = 1;s <= sp; s++){
                System.out.print(" ");
            }
            for(int str=1;str<=st;str++){
                if (str == 1 || str == st || i == n || i==1)                
             System.out.print("*");
             else System.out.print(" ");
            }
            System.out.println();
            st-=2;
            sp++;
        }
    }
    
}


