public class CopySting {
    static  int counter = 0;
    static int i = 0;
    public static void copyString(String Str , String emptyString){
        if (emptyString.length() != 0 && i == 0){
            System.out.println("Give Empty string");
            return;
        }
        if (counter == Str.length()-1){
            emptyString += Str.charAt(counter);
            System.out.println(emptyString);
            return;
        }
        emptyString+=Str.charAt(counter);
        counter++;
        copyString(Str,emptyString);



    }
    public static void main(String[] args) {
        String Str = "Abhishek";
        String Str2 = "";
        copyString(Str, Str2);
    }
}
