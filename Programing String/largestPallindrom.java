public class largestPallindrom {
    public static void main(String[] args) {
        String s="saurav malayalam malayyyyalam";
        System.out.print(larPal(s.toCharArray()));
   
    }
    public static String larPal(char[] arr){
        int max=Integer.MIN_VALUE;
        String s="";
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(ispal(arr,i,j)){
                    if(max<j-i+1){
                        max=j-i+1;
                    s=new String(arr,i,j-i+1);
                    // System.out.println(s);
                    }
                    
                }

            }
        }
        return s;
    }
    public static boolean ispal(char[] arr,int i,int j){
        while(i<j){
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
