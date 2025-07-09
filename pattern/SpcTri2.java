public class SpcTri2 {
    public static void main(String[] args) {
        int n=4;
        int str=1;
        for(int i=1;i<=n;i++){
           for(int s=1;s<=n-i;s++){
            System.out.print("P");
           }
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            str+=2;  
            System.out.println();
        }
    }
}

