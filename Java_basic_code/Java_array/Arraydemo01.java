public class Arraydemo01 {
    //
    //
    public static void main(String[] args) {
        
        int[] nums; // class an array

        nums = new int[10]; // build array 

        nums[0] = 1; // add iterms to the arrray
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        // compute the sum of this array
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
        }

        System.out.println("The sum: " + sum);

        // Type1
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(b[0]);

        // Type2: The fist one is 10, then the rest become 10 too
        int[] c = new int[10];
        c[0] = 10;
        System.out.println(c[0]);


        //To use the arrays
        int[] arrays = {1, 2, 3, 4, 5};

        //print the elements
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        System.out.println("===========");

        //compute the sum of the arrays
        int sum2 = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum2 += arrays[i];
        }
        System.out.println("The sum2: " + sum2);
        System.out.println("===========");

        //find the maximun 
        int max = arrays[0];

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        System.out.println("The max: " + max);


    }
}