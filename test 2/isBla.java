import java.util.Stack;
public class isBla {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
    }
       public static boolean isBalanced(String s){
        char[] s1=s.toCharArray();
        Stack stk = new Stack();
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='(' || s1[i]=='{' || s1[i]=='['){
                stk.push((Object)s1[i]);
            }else{
                if(stk.isEmpty())return false;
                char c=(char)stk.pop();
                if((c=='(' && s1[i] !=')')||
                (c=='{' && s1[i] !='}')||
                (c=='[' && s1[i] !=']'))return false;
            }
        }return stk.isEmpty();

       }
}
