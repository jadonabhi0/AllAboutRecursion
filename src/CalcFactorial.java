public class CalcFactorial {

    public static int calcFactorial(int n ){

        if(n == 1 || n ==0){
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact = fact_nm1*n;
        return fact;
    }



    
    public static void main(String[] args) {

        int ans = calcFactorial(6);
        System.out.println(ans
        );

    }

}
