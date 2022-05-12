package DynamicProgramming.Knapsack;

import java.util.Arrays;
import java.util.Collections;

public class knapsack
{

    static int knapsackk(int[] weight, int[] value, int capacity,int  n,int[][] dp){
        if(n == 0|| capacity == 0){

            return 0;
        }
        if (dp[n][capacity] != 0){
            return dp[n][capacity];
        }
        if(weight[n-1] > capacity){
            return dp[n][capacity]  = knapsackk(weight,value,capacity,n-1,dp);
        }else{
            return dp[n][capacity] = Math.max(value[n-1]+knapsackk(weight,value,capacity-weight[n-1],n-1,dp),
                    knapsackk(weight,value,capacity,n-1,dp));
        }
    }
    public static void main(String[] args){
        int[] value = {15,14,10,45,30};
        int [] weight = {2,5,1,3,4};
        int capacity = 8;
        int[][] dp = new int[value.length+1][capacity+1];

        int n = weight.length;
        System.out.println(knapsackk(weight, value, capacity, n,dp));
    }
}
