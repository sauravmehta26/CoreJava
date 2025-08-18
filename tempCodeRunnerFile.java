class unique2{
public static void main(String args[]){
String s= "abcdefggh";
int window=4;
String ans ="";
char[] ans=s.toCharArray();
for(int i=0;i<ans.length;i++){
    System.out.println(new String(s,i,window));
}