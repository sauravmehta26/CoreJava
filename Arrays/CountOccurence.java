public class CountOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4};//(1-2,2-2,3-1,4-1)
int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) continue; // already counted

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // mark as counted
                }
            }

            System.out.println(arr[i] + " - " + count);
        }
    }
}
