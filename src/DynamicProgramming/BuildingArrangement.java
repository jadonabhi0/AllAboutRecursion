package DynamicProgramming;

import java.util.ArrayList;

public class BuildingArrangement {
    static int arrangeBuildings(int n){
        // n is the length of road
        // n num of plots are on each size
        // no two buildings come together

        int[] building = new int[n+1];
        int[] space = new int[n+1];
        building[1] = 1;
        space[1] = 1;
        int total = 0;
        for(int i = 2 ;i < space.length ; i++){
            building[i] = space[i-1];
            space[i] = space[i-1]+building[i-1];
            total = space[n];
        }
        return total*total;
    }
    public static void main(String[] args){
        System.out.println(arrangeBuildings(6));
    }

}
