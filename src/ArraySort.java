import java.util.Arrays;

public class ArraySort {

    static void sortArray(int[] array, int n){
        if(n == array.length-1){
            return;
        }
       for(int i = n+1 ; i < array.length ; i++){
           if(array[n]  < array[i]){
               int temp = array[n];
               array[n] = array[i];
               array[i] = temp;
           }
       }
        sortArray(array,n+1);
        
    }


    
    public static void main(String[] args){
        int [] array = {3,6,8,4,1,9,6,7,3,4,};
        sortArray(array,0);
        System.out.println(Arrays.toString(array));
    }
}
