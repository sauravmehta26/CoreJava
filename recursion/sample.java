public class sample{
    public static void main(String args[]){
        To10(1);
        /*10 9 8 7 6 5 4 3 2 1 */
        // 1--10
    }
    static void To10(int i){
        System.out.print(i+"\t");
        if(i>=3)return;
        To10(++i);
        System.out.print(i+"\t");
        To10(++i);
        System.out.print(i+"\t");
        
    }
}