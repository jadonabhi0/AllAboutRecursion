public class KeypadCombinations {

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keypadCombination(String Str, int index, String combinaion){
        if(index == Str.length()){
            System.out.println(combinaion);
            return;
        }
        char currchar = Str.charAt(index);
        String mapping = keypad[currchar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            keypadCombination(Str,index+1,combinaion+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        keypadCombination("2",0,"");
    }
}
