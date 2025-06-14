public class hard2 {
    // 1
    // 3 2
    // 4 5 6 
    // 10 9 8 7
    // 11 12 13 14 15
    public static void main(String[] args) {
        int start;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int end = (i * (i + 1)) / 2;

            if (i % 2 == 0) {
                start = end;
                for (int j = 1; j <= i; j++) {
                    System.out.print(start+ " ");
                    start--;
                }
            } else {
                start = end - i + 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(start + " ");
                    start++;
                }
            }
            System.out.println();
        }
    }
    
}
