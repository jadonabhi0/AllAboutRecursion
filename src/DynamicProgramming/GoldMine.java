package DynamicProgramming;

public class GoldMine {
    static int goldmine(int[][] array,int m, int n,int i ,int j,int maxsum,String sos){
        if(m<=0){
            return maxsum;
        }
        if(m>i){
            return maxsum;
        }
        if (n > j){
            return maxsum;
        }
        else {
        goldmine(array,m-1,n,i,j,maxsum+array[m-1][n],sos+array[m-1][n]+" ");
        goldmine(array,m,n+1,i,j,maxsum+array[m][n+1],sos+array[m][n+1]+" ");
        goldmine(array,m+1,n,i,j,maxsum+array[m+1][n],sos+array[m+1][n]+" ");
        return maxsum;
        }


    }
    public static void main(String[] args){
        int[][] array = {{1,3,1,5},{2,2,4,1},{5,0,2,3},{0,6,1,2}};
        System.out.println(goldmine(array, 0, 0, 3, 3, 0, ""));
    }

}
