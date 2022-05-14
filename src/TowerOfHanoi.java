public class TowerOfHanoi {

    static int counter = 0;
    public static void towerOfHanoi(int n , String src , String helper , String dest){
        if (n == 1){
            System.out.println(n+"["+src+" to "+ dest+"]");
//            System.out.println(++counter);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println(n+"["+src + " to "+dest+"]");
//        System.out.println(++counter);
        towerOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n = 64;
        towerOfHanoi(n,"A","B","C");
    }

}
