class PrimeNum{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        for(int ele:arr){
            if(isprime(ele)){
                System.out.print(ele+" ");
            }
        }
           
    }
    public static boolean isprime(int n){
        if(n<2)return false;
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }return true;

    }
}
