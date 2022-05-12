package DynamicProgramming;

public class TillingMX1_TopDown {
    static  void tilling(int flen, int fbre, int tlen, int tbre){
        int[] dp =  new int[flen+1];
        for(int i = 1 ; i <= flen ; i++){
            if(i<tbre){
                dp[i] = 1;
            }else if(i == tbre){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-tlen]+dp[i-tbre];
            }
        }
        System.out.println(dp[flen]);
//        for(int i = 0 ; i < dp.length ; i++){
//            System.out.println(dp[i]);
//        }
    }
    public static void main(String[] args){
        tilling(8,3,1,3);
    }
}
