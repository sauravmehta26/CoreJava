class unique{
public static void main(String args[]){
String s= "abcdefggh";
char[] chars = s.toCharArray();
// int size=4
    for (int i=0; i <=chars.length - 4;i++) {
        String str = new String(chars,i,4);
         System.out.println(unique(str)?str:"false");
    }

    }
     static boolean unique(String str) {
        char []aToZ= new char[26];
        for (int i = 0;i< str.length();i++) {
            int index = str.charAt(i)-'a';
            aToZ[index]+=1;
        }
        for (int j = 0; j < aToZ.length;j++) {
                if (aToZ[j]>1) return false;
            }
        return true;
    }
    }
