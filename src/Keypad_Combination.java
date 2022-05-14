public class Keypad_Combination {


    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static void keyComb(String str,int index,String comb){

        if (index == str.length()){
            System.out.println(comb);
            return;
        }

        char ch = str.charAt(index);
        String s = keypad[ch-'0'];
        for(int i = 0 ; i <  s.length() ; i++){
            keyComb(str,index+1,comb+s.charAt(i));
        }

    }

    public static void main(String[] args){
        keyComb("12",0,"");
    }
}
