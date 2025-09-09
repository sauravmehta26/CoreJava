class binToDec{
    public static void main(String[] args) {
        int bin=110;
        System.out.println(b2d(bin,0,1));
    }
    static int b2d(int n,int sum,int p){
        if(n==0) return sum;
        int rem=n%10;
        sum=sum+p*rem;
        return b2d(n/10,sum,p*2);
    }
}