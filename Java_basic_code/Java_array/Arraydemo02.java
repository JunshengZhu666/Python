public class Arraydemo02 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        // for (int array: arrays) {
        //     System.out.println(array);
        // }
            int[] reverse = reverse(arrays);
            System.out.print(reverse);
            System.out.println("========Now for 2_dim======");

        // 2-dim array
        int[][] array_2dim = {{1,2}, {2,3}, {3,4}, {4,5}};
        System.out.println(array_2dim[2][0]);
        System.out.println(array_2dim[2][1]);

        // To print the 2_dim array
        for (int i = 0; i < array_2dim.length; i++) {
            for (int j = 0; j < array_2dim[i].length; j++) {
                System.out.println(array_2dim[i][j]);
            }
        }
    }

        // Reverse
        public static int[] reverse(int[] arrays){
            int[] result = new int[arrays.length];

            //To make reverse happend
            for (int i = 0, j = result.length -1; 
            i < arrays.length; i++, j--) {
                result[j] = arrays[i];
            }
            return result;
        }

    
}