public class GeneratePalindromicSubString {

    static boolean isPalindrome(String s){
        int i = 0 ; int j = s.length()-1;
        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    static  void generate(String str){
        int len = Integer.MIN_VALUE;
        String ns = "";
        for (int i = 0 ; i < str.length() ;i++){
            for (int j = i+1 ; j <= str.length() ; j++){
                String s = str.substring(i,j);
                if (isPalindrome(s)){
                    int nlen = s.length();
                    if (nlen > len){
                        ns = s;
                        len = nlen;
                    }
                }
            }
        }
        System.out.println(ns);
    }

    public static void main(String[] args) {
        generate("babad");
    }
}
