public class IsArraySorted {
    public static int index = 0;

    public static void isArraySorted(int[] array){

        if (array.length == 0){
            System.out.println("Array is empty");
            return;
        }


        if (index == array.length-2){
            if (array[index] <= array[index+1]){
                System.out.println("true");
            }
        }

        else if(array[index] <= array[index+1]){
            index++;
            isArraySorted(array);
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        isArraySorted(new int[]{1,9,3,4,5});
    }
}
