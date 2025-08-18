public class NumToWords {
    private static final String[] belowTwenty = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convert(int num) {
        if (num == 0) return "Zero";
        return helper(num).trim();
    }

    private static String helper(int num) {
        if (num < 20) return belowTwenty[num] + " ";
        else if (num < 100) return tens[num / 10] + " " + helper(num % 10);
        else if (num < 1000) return belowTwenty[num / 100] + " Hundred " + helper(num % 100);
        else if (num < 1000000) return helper(num / 1000) + "Thousand " + helper(num % 1000);
        return "";
    }

    public static void main(String[] args) {
        int num = 1223;
        System.out.println(num + " = " + convert(num));
    }
}
