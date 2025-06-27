public class HaloTrngl {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;
        int st = 1;
        for(int i = 1;i <= n;i++){
            for(int s = 1;s <= sp; s++){
                System.out.print(" ");
            }
            for(int str=1;str<=st;str++){
                if (str == 1 || str == st || i == n)                
             System.out.print("*");
             else System.out.print(" ");
            }
            System.out.println();
            st+=2;
            sp--;
        }
    }
    
}
