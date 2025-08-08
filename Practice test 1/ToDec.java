public class ToDec {
    public static void main(String[] args) {
        int n=1011;
        int dec=0;
        int p=1;
        while(n>0){
            int r=n%10;
            dec+=p*r;
            p*=2;
            n=n/10;
        }
        System.out.println(dec);
    }
}
