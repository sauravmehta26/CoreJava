public class StrToInt{
    public static void main(String []args){
        String str = "12345";
        int num=0;
        for(int i=0;i<str.length();i++){
            num=num*10+(str.charAt(i)-'0');
        }
        System.out.print(num+"\n");
        System.out.println(((Object)num).getClass().getSimpleName());
    }
}