public class CaseConvert {
public static void main(String[] args) {
    String s="hello 89 GUYS";
    char[] a= s.toCharArray();
    for(int i=0;i<a.length;i++){
        if(a[i]>=65 && a[i]<=90){
            a[i]= (char)(a[i]+32);
        }else if(a[i]>=97 && a[i]<=122){
            a[i] = (char)(a[i]-32);
        }
    }
    String result = new String(a);
    System.out.println(result);
}    
}
