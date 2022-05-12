package DynamicProgramming;

public class BinaryString_N_LengthCount {

    static int countBinaryString(int n){
        // constraint no consecutive zeros come together;

        int  one = 1;
        int zero = 1;
        for(int i = 1 ; i < n ; i++){
            int temp = zero;
            zero = one;
            one = one+temp;
        }
        return one+zero;

        // we can also solve this by using array;
    }

    public static void main(String[] args){
        System.out.println(countBinaryString(6));
    }
}
