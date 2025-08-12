public class DigonalSum {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{2,3,4},{4,5,6}};
        for(int[] i:arr){
            for(int ele:i){
                System.out.print(ele+"\t");
            }
            System.out.println();

        }
        int len=arr.length;
        System.out.println(len);
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=arr[i][i];
            if(len%2 !=0 && i!=len/2  )
            sum+=arr[i][len-i-1];
        }
        System.out.println(sum);
        /*1 2 3 4
          1 2 3 4
          1 2 3 4
          1 2 3 4
         */
    }
}
