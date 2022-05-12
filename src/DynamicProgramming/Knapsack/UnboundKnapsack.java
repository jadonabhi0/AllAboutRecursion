package DynamicProgramming.Knapsack;

public class UnboundKnapsack {

    static void unboundKnapsack(int [] wt, int[] val,int[] dp,int cap){
        for(int i = 1 ; i < dp.length ; i++){
            for(int j =  0 ; j < wt.length ; j++){
                if (i >= wt[j]){
                    int rwt = i-wt[j];
                    if(dp[i]>dp[rwt]+val[j]){
                        dp[i] = dp[i];
                    }else{
                        dp[i] = dp[rwt]+val[j];
                    }
                }

            }
        }


        for(int i : dp){
            System.out.print(i+" ");
        }
    }

    public static void  main(String[] args){
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int cap = 7;
        int[] dp = new int[cap+1];
        unboundKnapsack(wt,val,dp,cap);
        System.out.println();
        String s = new StringBuilder("asdasdas").reverse().toString();
        System.out.println(s);


// shri hari stotram


    }
}
