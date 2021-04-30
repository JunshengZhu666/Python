import java.util.Arrays;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] a = {1, 23, 32, 234, 234, 234, 43, 4522};

        //Sort and return
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
        
    }

    public static int[] sort(int[] array) {

        //Temperary var
        int temp = 0;

        //Outer loop, how many times
        for (int i = 0; i < array.length - 1; i++) {
            //inner loop, compare two nums and exchange 
            for (int j = 0; j  < array.length -1 -i; j++) {
                if (array[j+1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }    
            }
        }
        return array;
    }
}