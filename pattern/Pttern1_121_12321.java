public class Pttern1_121_12321 {
//       1
//      121
//     12321
//    1234321
public static void main(String[] args) {
    

int n=4;
for(int i=1;i<=n;i++){
    for(int s=1;s<=n-i;s++){
        System.out.print(" "); 
    }
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    for(int k=i-1;k>0;k--){
        System.out.print(k);
        }
    System.out.println();
}
}
}
