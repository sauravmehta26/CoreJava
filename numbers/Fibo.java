public class Fibo {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        int n=10;
        for(int k=0;k<=n;k++){
            System.out.print(i+"\t");
            int temp=i;
            i=j;
            j=temp+j;
        }
    }
}
