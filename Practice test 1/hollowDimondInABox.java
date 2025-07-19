public class hollowDimondInABox{
    public static void main(String[] args){
        int n = 7;
        int s = n/2;
        int str =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s+1;j++){
                if(j!=n/2+1)
                System.out.print("*");
            }
            for(int j=2;j<=str-1;j++){
                        System.out.print("p");
            }
            for(int j=1;j<=s+1;j++){
                // if(j!=n/2+1)
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                s--;
                str+=2;
            }else{
                s++;
                str-=2;
            }
        }

    }
}