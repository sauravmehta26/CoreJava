public class RemoveDupChar{
    public static void main(String args[]){
    String s= "abcdefggh";
    String ans = "";
    for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        if(!ans.contains(ch+""))ans+=ch;
    }
    System.out.print(ans);
    }
}