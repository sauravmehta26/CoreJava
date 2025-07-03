public class ToBin {
    public static void main(String[] args) {
        int n=11;
        int bin=0;
        int p=1;
        while(n>0){
            int bit=n%2;
            bin+=(bit*p);
            p*=10;
            n=n/2;
        }
        System.out.println(bin);
    }
    
}
