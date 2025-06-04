class PrimeNum{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for(int ele:arr){
            if(isprime(ele)){
                System.out.print(ele+" ");
            }
        }
       
        }
         static boolean isprime(int n){
            if(n<=1)return false;
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i == 0) return false;
            }return true;

    }
}
