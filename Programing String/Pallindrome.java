public class Pallindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(ispallid(s));  
    }
    public static boolean ispallid(String s){
        // s=s.toLowerCase();
        char[] a= s.toLowerCase().toCharArray();
        int i =0,j=a.length-1;
        while(i<j){
            if(a[i] != a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
