public class Sp {
    public static void main(String[] args) {
        int n = 5;
        int sp =n-1;
        int st = 1;
        for(int i = 1; i <= n; i++){
            int p = 0;
            for(int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
                for(int k = 1; k <= st; k++){
                    if(k<=i){
                        System.out.print(k+" ");
                        p = k;
                    }else
                        System.out.print(--p+" ");
                }
            System.out.println();
            sp--;
            st+=2;
        }
    }
}
