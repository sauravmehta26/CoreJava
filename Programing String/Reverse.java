public class Reverse {
   public static void main(String[] args){
    System.out.println(reverse("java is a good language"));
   }  
   static String reverse(String s){
    char[] a = s.toCharArray();
    for(int i = 0, j=a.length-1;i<j;i++,j--){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
   /*  // int i = 0;
    // int j = a.length - 1;
    // while(i<j){
    //     char temp = a[i];
    //     a[i] = a[j];
    //     a[j] = temp;
    //     i++;
    //     j--;
    // }*/
    String s2 = new String(a);
    return s2;
   } 
}
