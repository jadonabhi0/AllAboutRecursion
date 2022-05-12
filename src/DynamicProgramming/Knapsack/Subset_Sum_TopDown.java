package DynamicProgramming.Knapsack;

import java.util.Arrays;

public class Subset_Sum_TopDown {
    static boolean subsetSum(int [] array,int sum){
        boolean[][] dp = new boolean[array.length+1][sum+1];
        for(int i = 0 ;i < array.length+1 ; i++){
            for (int j = 0 ; j < dp[0].length ; j++) {
               if(i == 0 && j == 0){
                    dp[i][j] = true;
               }
               else if (i == 0 && j > 0) {
                    dp[i][j] = false;
               }
               else if (j == 0 && i > 0) {
                       dp[i][j] = true;
               }
               else {
                   if (j >= array[i - 1]) {
                       if (dp[i - 1][j]) {
                           dp[i][j] = dp[i - 1][j];
                       } else {
                           dp[i][j] = dp[i - 1][j - array[i - 1]];
                       }

                   } else {
                       dp[i][j] = dp[i - 1][j];
                   }
               }



            }
        }
        return dp[array.length][sum];
    }


    public static void main(String[] args){
        int [] array = {4,2,7,1,3};
        int sum = 10;
        System.out.println(subsetSum(array, sum));
    }
}

