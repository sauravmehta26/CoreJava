public class EvenIndexValue {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0,10};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                 System.out.print(arr[i]);
                    if(i != arr.length-2 && i != arr.length-1)
                    System.out.print(","); 
            }
        }
    }
    
}
