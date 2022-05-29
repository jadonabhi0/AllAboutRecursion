import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class PalindromeString {

    static int counter = 0;
    static String newStr = "";
    static  int i = 1;
    public static String strReverse(String str){
        counter = str.length()-i;
        if (counter == 0){
           newStr =  newStr+str.charAt(counter);
            return newStr;
        }
        newStr = newStr+str.charAt(counter);
        i++;
        counter--;
        strReverse(str);
        return newStr;
    }



    public static void palindromeString(String str){
        if (strReverse(str).equals(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
    }


    public static void main(String[] args) {
        palindromeString("Abhishek");
        

    }
}
