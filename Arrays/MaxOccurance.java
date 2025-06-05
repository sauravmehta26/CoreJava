public class MaxOccurance {
public static void main(String[] args) {
    int arr[]={1,2,1,3,1,4};
    int b[]=new int[10];
    for (int i=0;i<arr.length;i++){
        b[arr[i]]++;     
    }  
    int max=Integer.MIN_VALUE;
    int ele=0;
    for(int i=0;i<b.length;i++){
        if(b[i]>max){
            max=b[i];
            ele=i;
        }
    } System.out.println(max+" times "+ele); 
}
}
