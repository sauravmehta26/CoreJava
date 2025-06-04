public class SndLargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4,};
        int sl=arr[0];
        int l=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }if(arr[i]>sl && arr[i]!=l){
                sl=arr[i];
            }
        }System.out.println(sl);
    }
    
}
