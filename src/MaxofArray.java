import java.util.Arrays;

public class MaxofArray {

    static void maxOfArray(int[] array,  int n){
        if(array.length-1 == n){
            return;
        }
       if(array[n] > array[n+1]){
           int temp  = array[n];
           array[n] = array[n+1];
           array[n+1] = temp;
       }
       maxOfArray(array,n+1);
    }
    public static void main(String[] args){
        int [] array = {2,4,6,10000,4,1,7,90,1};
        maxOfArray(array,0);
//        System.out.println(Arrays.toString(array));
        System.out.println("Max of array is : "+array[array.length-1]);

    }
}
