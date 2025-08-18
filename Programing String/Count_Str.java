public class Count_Str{
    public static void main(String[] args){
        String s="java is very very easy java";
        String[] str= s.split(" ");
        for(int i=0;i<str.length;i++){
            int count =1;
            if(str[i].equals("0"))continue;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])) {
                    count++;
                    str[j]="0";
                }  
            }
            System.out.println(str[i]+"="+count);
            
        }
    }
}