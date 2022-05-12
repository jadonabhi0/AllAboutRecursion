package DynamicProgramming;

public class CoinChangeCombination {

    static void coinChange(int[] array,int tar){
        int[] dp = new int[tar+1];
        dp[0] = 1;
        for(int i = 0 ;i < array.length ;i++){
            for(int j = array[i] ;  j < dp.length ; j++){
                dp[j] += dp[j-array[i]];
            }
        }
        System.out.println(dp[tar]);
        for (int i:
             dp) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        int[] array = {2,3,51,2,3,4,5,6};
        coinChange(array,10);
    }
}

