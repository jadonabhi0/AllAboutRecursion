package DynamicProgramming;

import java.util.HashMap;

public class Tilling2X1_Recursive {
    static HashMap<String,Integer> dp = new HashMap<>();
    static int tilling(int length, int breadth, int tlen, int tbre) {
        String key = length + "#";
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int out2;
        int out1;
        if (length==0) {
            return 1;
        } else if (length < 0) {
            return 0;
        } else {
            out1 = tilling(length - tlen, breadth, tlen, tbre);
            out2 = tilling(length - tbre, breadth, tlen, tbre);
            dp.put(key, out1+out2);
        }
        return dp.get(key);

    }

    public static void main(String[] args){
        System.out.println(tilling(100, 2, 1, 2));
    }

}
