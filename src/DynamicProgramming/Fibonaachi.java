package DynamicProgramming;

public class Fibonaachi {

    static int fib(int n,int[] dp){
        if(n== 0 || n == 1){
            return n;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        int f1 = fib(n-1,dp);
        int f2 = fib(n-2,dp);

        dp[n]  = f1+f2;
        return f1+f2;
    }
    public static void main(String[] args){
        int n = 10;
        int[] array = new int[n+1];
        System.out.println(fib(n,array));
    }
}
