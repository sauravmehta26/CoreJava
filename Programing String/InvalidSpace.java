public class InvalidSpace{
    public static void main(String[] args){
    String str="  hi   i am  awesome saurav    ";// =="hi i am awesome saurav"
    String s=str.trim();
    // System.out.print(s);
    StringBuilder ans = new StringBuilder();
    // String ans="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' ' && s.charAt(i+1)==' ')continue;
        ans.append(s.charAt(i));
        // ans+=s.charAt(i);  
    }
    System.out.print(ans.toString());
    // System.out.print(ans);
}
}