package DynamicProgramming.Knapsack;

import java.util.HashMap;

public class Kanpsack01_recursive {
    public static void main(String[] args){
        int[] value = {15,14,10,45,30};
        int [] weight = {2,5,1,3,4};
        int capacity = 7;
        HashMap<String,Integer> set = new HashMap<>();
        System.out.println(knapsack(weight, value, capacity, 0,set));

    }

    static int knapsack(int[] weight, int[] value, int capacity, int i,HashMap<String,Integer> map){
        if(capacity == 0 || i == weight.length) return 0;
        String key = capacity+"#"+i;
        if(map.containsKey(key)){
            return map.get(key);
        }

        if(capacity<weight[i]){
            return knapsack(weight,value,capacity,i+1,map);
        }else{
            // if include
            int out1 = value[i] +  knapsack(weight,value,capacity-weight[i],i+1,map);
            // if not including
            int out2 = knapsack(weight,value,capacity,i+1,map);
            map.put(key,Math.max(out1,out2));
            return Math.max(out1,out2);
        }


    }

}
