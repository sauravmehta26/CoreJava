public class hollowDimond{
    public static void main(String[] args){
        int n = 7;
        int s = n/2;
        int str =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                if(j==1 || j==str){
                System.out.print("*");
                }else 
                        System.out.print(" ");
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