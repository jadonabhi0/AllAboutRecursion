public class PrintArray {

    static void printArray(int[] array, int len){
        if(len < 0){
            return;
        }
        printArray(array,len-1);
        System.out.print(array[len]+" ");
    }
    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7,87,89,9};
        printArray(array,array.length-1);
    }
}
