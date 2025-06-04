public class LastGivenIndex {
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5,9,6,7,8,4};
        int k=9;
        int lastI=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                lastI=i;
            }
        }
        System.out.println(arr[lastI]);
    }
}
