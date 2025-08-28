public class SumofDigits {
    public static void main(String[] args) {
        String s="1a6b4h4";
        int sum = sumd(s, 0, 0);
        System.out.println("Final single digit sum: " + sum);
    }
    public static int sumd(String s,int sum,int i){ 
        if(i==s.length()){
        if(sum>9)return sumd(Integer.toString(sum),0,0);
        return sum;
        }
       char ch = s.charAt(i);
        if(ch>='0' && ch<='9'){
            sum+=(ch-'0');
        }
    
       return sumd(s,sum,i+1);
    }

}
