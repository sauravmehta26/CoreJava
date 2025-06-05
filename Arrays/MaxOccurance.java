public class MaxOccurance {
public static void main(String[] args) {
    int arr[]={1,2,1,3,1,4};
    int maxc=0;
    int ele=-1;
    for (int i=0;i<arr.length;i++){
        int currc=1;
    for (int j=i+1;j<arr.length-1;j++){
        if(arr[i]==arr[j]){
            currc++;
        }
    }
    if(maxc<currc){
        maxc=currc;
        ele=arr[i];
    }
}System.out.println(ele+" occured "+maxc+" times.");
}    
}
