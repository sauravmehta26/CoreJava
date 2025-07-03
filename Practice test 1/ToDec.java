public class ToDec {
    public static void main(String[] args) {
        int bin=1011;
        int dec=0;
        int p=1;
        while(bin>0){
            int bit=bin%10;
            dec+=p*bit;
            p*=2;
            bin=bin/10;
        }
        System.out.println(dec);
    }
}
