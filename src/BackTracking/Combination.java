package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public void comb(int[] array, int idx, List<Integer> list, int k){

        if (k<0) return;
        if (idx == array.length){
            if ( k == 0){
                System.out.println(list);
            }
            return;
        }


        list.add(array[idx]);
        comb(array, idx+1, list, k-array[idx]);
        list.remove(list.size()-1);
        comb(array, idx+1, list, k);


    }


    public static void main(String[] args) {

        Combination cm = new Combination();
        cm.comb(new int[]{2,3,6,7},0, new ArrayList<>(),7);

    }


}
