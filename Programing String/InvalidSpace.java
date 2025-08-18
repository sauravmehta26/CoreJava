public class InvalidSpace{
    public static void main(String[] args){
    String str="  hi   i am  awesome saurav    ";// =="hi i am awesome saurav"
    String s=str.trim();
    // System.out.print(s);
    String ans="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' ' && s.charAt(i+1)==' ')continue;
        ans+=s.charAt(i);  
    }
    System.out.print(ans);
}
}