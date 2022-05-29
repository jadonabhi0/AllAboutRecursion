public class GenerateSubStrings {

    public static  void generate(String s){
        for (int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String str = s.substring(i,j);
                System.out.println(str);
            }
        }

    }


    public static void main(String[] args) {
        generate("abhi");
    }

}
