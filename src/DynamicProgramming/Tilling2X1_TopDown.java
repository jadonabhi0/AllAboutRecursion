package DynamicProgramming;

public class Tilling2X1_TopDown {
    static void tilling(int flen, int fbre, int tlen, int tbre) {
        int[] dp = new int[flen + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[flen]);

    }


    public static void main(String[] args) {
        tilling(10, 2, 2, 1);
    }
}
