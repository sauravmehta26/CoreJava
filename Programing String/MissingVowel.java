public class MissingVowel{
    public static void main(String[] args){
        String str="IndIa";//eou
        str=str.toLowerCase();
        String vowel ="aeiou";
        // char[] s=str.toLowerCase().toCharArray();
        // char[] vowel={'a','e','i','o','u'};
        // int len=str.length()<=vowel.length()?str.length():vowel.length();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            // str=str.replace(c+"","");
            vowel=vowel.replace(c+"","");
            // len--;
        }
        System.out.println(vowel);

    }
}