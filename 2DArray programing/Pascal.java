public class Pascal {
    static void pascalT(int[][] a){
        for(int i =0;i<a.length;i++){
            a[i]=new int [i+1];
            for(int j=0;j<a[i].length;j++){
                if(j==0||i==j) a[i][j]=1;
                else
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }

    }
    public static void main(String[] args) {
        int [][]a= new int[5][];
        pascalT(a);
        int sp=a.length-1;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=sp;j++)System.out.print(" ");
            for(int k=0;k<a[i].length;k++)System.out.print(a[i][k]+" ");
            System.out.println();
            sp--;
        }
    }
    
}
