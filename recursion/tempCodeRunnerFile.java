public static boolean isPrime(int n,int half){
        if(half==1) return true;
        if(n<=1 || n%half == 0) return false;
        return isPrime(n,half-1);
    }