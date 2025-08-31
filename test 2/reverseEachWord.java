public class reverseEachWord{
    public static void main(String args[]){
        String s="java is easy";// easy is java
        char[] s1=s.toCharArray();
        int end=s1.length-1;
        String ans="";
        for(int i=end;i>=0;i--){
            if(s1[i]==' ' || i==0){
                int start=(i==0) ? 0 : i+1;
            for(int j=start;j<=end;j++){
                ans+=s1[j];
            }
            if(i!=0) ans+="_";
               end=i-1;
            }
        }
        System.out.println(ans);
    }

}