public static void main(String[] args) {
        int num = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int end = num + i - 1;
                for (int j = end; j >= num; j--) {
                    System.out.print(j + " ");
                }
                num = end + 1;
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }