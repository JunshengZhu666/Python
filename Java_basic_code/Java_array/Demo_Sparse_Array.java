public class Demo_Sparse_Array {
    public static void main(String[] args) {
        // 1, build a 2-dim array 11 * 11, 0:null, 1:black, 2:white
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 1;
        // output
        System.out.println("The origin array");

        for (int[] ints: array1) {
            for (int anInt: ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        // Transform to sparse array
        // 1, To get the num of the exist num 
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("The valid numbers:" + sum);

        //2, create a sparse array
        int[][] array2 = new int[sum+1][3];

        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //3, Go through the vaild numbers and store them
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                }
            }
        }

        //4, Output the sparse array
        System.out.println("Output the sparse array");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t"
            +array2[i][1] + "\t"
            +array2[i][2] + "\t"
            );
        }

        //5, Read the sparse array
        int[][]array3 = new int[array2[0][0]] [array2[0][1]];

        //6, Regive the origin value
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]] [array2[i][1]] = array2[i][2];
        }

        // output the regive array
        System.out.println("The origin array");

        for (int[] ints: array1) {
            for (int anInt: ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }


        
    }
}

