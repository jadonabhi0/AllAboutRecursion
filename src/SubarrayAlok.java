import java.util.HashSet;
import java.util.Set;

public class SubarrayAlok {

    public static  void generate(int [] array, int n, int m){
      int x = 0;
      int pre = 0;
      int max = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int i = 0 ; i < n ; i++){
            pre = (pre + array[i]) % m;
            max = Math.max(max, pre);

            int it = 0;
            for(int j : set){
                if (j >= pre+1){
                    it = j;
                }
            }
            if (it != 0){
                max = Math.max(max, pre - it + m);
            }
            set.add(pre);
        }
        System.out.println(max);
    }



    public static void helper(int [] array){
        int ans = array[0];
        for(int i =1 ; i < array.length ; i++){
            ans -= array[i];
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int [] array = new int[]{3,9,5};
        generate(array, array.length, array.length);
//        int[] arr = {0, -1, -1, -1};
//        int[] arr2 = {100, 10};
//        helper(arr);
//        helper(arr2);

    }

}
