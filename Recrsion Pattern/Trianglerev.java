public class Trianglerev{
    public static void main(String [] args){
        int n=5;
        triangle(n,0);
        System.out.println("\n===============================");
        trianglerev(n,0);
    }
    public static void trianglerev(int r ,int c){
        if(r == 0) return;
        if(c<r){
        System.out.print("*");
        trianglerev(r,c+1);
        }else{
        System.out.println();
        trianglerev(r-1,0);
        }
      
    }
    public static void triangle(int r ,int c){
        if(r == 0) return;
        if(c<r){
        triangle(r,c+1);
        System.out.print("*");
        }else{
        triangle(r-1,0);
        System.out.println();
        }
      
    }
}