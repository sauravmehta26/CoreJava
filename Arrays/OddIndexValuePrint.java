public class OddIndexValuePrint {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0,2,4};
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i]);
                if(i != arr.length - 1 && i != arr.length-2)
                    System.out.print(",");
            }
        }
    }
    
}
