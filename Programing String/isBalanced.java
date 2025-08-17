import java.util.*;

class isBalanced {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
        System.out.println(isBalancedSimple("((((({})))))")? "Balanced" : "Not Balanced");
    }
    
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '['))
                    return false;
            }
        }
        return st.isEmpty();
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
