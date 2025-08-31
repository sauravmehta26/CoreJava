class permutation{
    public static void main(String[] args){
        String s="abc";
        permu(s,0,2);
    }
    public static void permu(String s,int start,int end){
        if(start==end){
            System.out.println(s);
            return;
        }
        for(int i=start;i<=end;i++){
            String s1=swap(s,start,i);
            permu(s1,start+1,end);
        }
    }
    public static String swap(String b,int s,int e ){
        char[] a=b.toCharArray();
        char temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        return new String(a);
    }
}