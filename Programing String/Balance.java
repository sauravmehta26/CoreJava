import java.util.Stack;
public class Balance {
    public static void main(String[] args) {
        System.out.println(isBalance("[{}(){}]"));
    }
    static boolean isBalance(String s){
        char[] a = s.toCharArray();
        Stack stack = new Stack();
        for(int i = 0;i<a.length;i++){
            char c1 = a[i];
            if(c1=='['||c1=='{'||c1=='('){
                stack.push(c1);
            }
            else if(c1==']'||c1=='}'||c1==')'){
                if(stack.isEmpty())return false;
                char c2 = (Character)stack.pop();
                if(!match(c2,c1)) return false;
            }
        }
        return stack.isEmpty();
    }
    static boolean match(char c1,char c2){
        if(c1=='[' && c2==']')return true;
        if(c1=='{' && c2=='}')return true;
        if(c1=='(' && c2==')')return true;
        return false;
    }
}
