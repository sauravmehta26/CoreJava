import java.util.Stack;

class isBalanced {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
        System.out.println(isBalancedSimple("((((({})))))")? "Balanced" : "Not Balanced");
    }
    
    static boolean isBalanced(String s) {
        // code here
        char[] a=s.toCharArray();
        Stack stack =new Stack();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('||a[i]=='{'||a[i]=='[') {
                stack.push((Object)a[i]);
            }else {
                if(stack.isEmpty()) return false;
                char top = (Character)stack.pop();
                if((a[i]==')' && top != '(') ||
                   (a[i]=='}' && top != '{') ||
                   (a[i]==']' && top != '[')) return false;
            }
            
        }
        return stack.isEmpty();
        
    }
    static boolean isBalancedSimple(String s) {
    int count = 0;
    for (char c : s.toCharArray()) {
        if (c == '(') count++;
        else if (c == ')') {
            if (count == 0) return false;
            count--;
        }
    }
    return count == 0;
}

}
