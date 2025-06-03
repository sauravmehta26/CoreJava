class SingleDigitSum{
    public static void main(String[] args) {
        long n=999999999998l;
        System.out.println(sum(n));
    }
    public static long sum(long n) {
        while(n>9){
            long sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
    }
        return n;
}

}