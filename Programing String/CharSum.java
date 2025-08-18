public class CharSum{
    public static void main(String[] args){
        char a='1';
        char b='1';
        int num;
        num=(a-'0')+(b-'0');
        // 
        System.out.println(num);
        System.out.println(((Object)num).getClass().getSimpleName());
        // 
        char c=(char)(num+'0');
        System.out.println(c);
        System.out.println(((Object)c).getClass().getSimpleName());
    }
}