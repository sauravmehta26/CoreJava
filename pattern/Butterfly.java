public class Butterfly {
    public static void main(String[] args) {
        int n=7;
        int str=1;
        int sp=n/2;
        for(int i =1; i<=n;i++){
            for(int j =1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                if(j==str || j==1 ){
                System.out.print("*");
                }else System.out.print(" ");
            }
            if(i<=n/2){
                sp--;
                str+=2;
            }else{
                sp++;
                str-=2;
            }
            
            System.out.println();
            
        }
    }
}
