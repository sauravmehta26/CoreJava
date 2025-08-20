public class RemoveDupStr{
    public static void main(String args[]){
        String str="java is very very easy java";//==>java is very easy
        String[] s=str.split(" ");
        String ans="";
        for(int i=0;i<s.length;i++){
            if(!ans.contains(s[i])) ans+=s[i]+" ";
        }
        System.out.println(ans.trim());

    }
}