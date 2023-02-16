public class Dog {
    static int ans=0;
    public static int countEar(int n){

        if (n == 1){
            return  2;
        }
        int a = countEar(n-1)+2;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(countEar(4));
    }

}
