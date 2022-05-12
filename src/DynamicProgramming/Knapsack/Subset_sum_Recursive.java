package DynamicProgramming.Knapsack;

public class Subset_sum_Recursive {

    static boolean subsetSum(int[] array, int n ,int sum,boolean[][] dp){

        if(n == 0) return false;
        if(sum == 0) return true;
        if(dp[n-1][sum] != false) return dp[n][sum];
        if(sum<array[n-1]) return dp[n-1][sum] = subsetSum(array,n-1,sum,dp);
        else{
          if( subsetSum(array,n-1,sum,dp) || subsetSum(array,n-1,sum-array[n-1],dp) != false){
              dp[n-1][sum] = true;
          }
          else{
              dp[n-1][sum] = false;
          }
        }
        return   dp[n-1][sum];
    }
    public static void main(String[] args){
        int [] array = {4,2,7};
        int sum = 10;
        int n = array.length-1;
        boolean[][] dp = new boolean[n+1][sum+1];
        System.out.println(subsetSum(array, n, sum,dp));
    }
}
