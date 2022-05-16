public class CalcPower {
    public static double calcPower(int x, int n){

          if (n==0){
              return 1;
          }
          if (x==0){
              return 0;
          }

          double nm1 = calcPower(x,n-1);
          double  ans = (double) x*nm1;

          return ans;



    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        double ans = calcPower(x,n);
        System.out.println(ans);
    }
}
