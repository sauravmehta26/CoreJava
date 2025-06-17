public class Dimond {
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
public static void main(String[] args) {
    int n = 7;
    int space =n/2 ;
    int stars = 1;
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i <= n / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }
}  
}
