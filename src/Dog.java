public class Dog {
    static int ans=0;
    public static int countEar(int n){

        if (n == 1){
            return  2;
        }
        n--;
        return countEar(n)+2;

    }

    public static void main(String[] args) {
        System.out.println(countEar(4));
    }

}
