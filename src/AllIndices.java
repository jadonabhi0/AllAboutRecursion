import java.util.Arrays;

public class AllIndices {

    static int[] allIndices(int[] array,int num, int index, int fsf ){

        
        if(index == array.length){
            return  new int[fsf] ;
        }

        if(array[index] == num){
            int[] arr = allIndices(array,num,index+1,fsf+1);
            arr[fsf] = index;
            return arr;
        }
        else{
            int[] arr =    allIndices(array,num,index+1,fsf);
            return arr;
        }
    }

    
    public static void main(String[] args){
        int [] array  = {2,1,2,3,4,5,1,21,3,1,1,1,1};
        int [] arr = allIndices(array,2 ,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
