package DynamicProgramming.Knapsack;

public class Knapsack_01_TopDown {

    public static void knapsack01(int[] weight, int [] cost, int capacity){
        int weights = weight.length;
        int costs  = cost.length;

        int[][] dp = new  int[costs+1][capacity+1];
        for(int i = 1 ; i < dp.length ; i++){
            for(int j = 1 ; j < dp[0].length ; j++){
                if(j >= weight[i-1]){
                    int rcap = j-weight[i-1];
                    if(cost[i-1]+dp[i-1][rcap] > dp[i-1][j]){
                        dp[i][j] = cost[i -1]+dp[i-1][rcap];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.print(dp[costs][capacity]);


    }
    public static void main(String[] args){
        int[] weight = {2,5,1,3,4};
        int[] cost = {15,14,10,45,30};
        int capacity = 7;
        knapsack01(weight,cost,capacity);
    }
}
