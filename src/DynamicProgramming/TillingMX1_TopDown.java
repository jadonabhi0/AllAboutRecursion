package DynamicProgramming;

import java.util.Scanner;

public class TillingMX1_TopDown {
    static  void tilling(int flen, int fbre){
        int[] dp =  new int[flen+1];
        for(int i = 1 ; i <= flen ; i++){
            if(i<fbre){
                dp[i] = 1;
            }else if(i == fbre){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-1]+dp[i-fbre];
            }
        }
        System.out.println(dp[flen]);

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        tilling(n,m);
    }
}
