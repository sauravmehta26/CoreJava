public class CountOccurence {
    public static void main(String[] args) {
    int arr[]={1,2,1,3,2,4};//(1-2,2-2,3-1,4-1)
    int[] temp= new int[10];
    for(int i = 0; i<arr.length; i++){
        
            temp[arr[i]]++;
    }
    for(int j=0;j<temp.length;j++){
    if(temp[j]!=0)
    System.out.println(j+"-"+temp[j]);
    }
}
}

