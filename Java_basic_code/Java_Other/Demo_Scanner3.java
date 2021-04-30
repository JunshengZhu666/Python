import java.util.Scanner;

public class Demo_Scanner3 {

    public static void main(String[] args) {
        // Compute the sum and ave of every num, use enter to confirm num, use non_num to stop
        Scanner scanner = new Scanner(System.in);

        //Sum
        double sum = 0;
        //Num_numbers
        int m = 0;

        //Use whlie to judge if are still imputting
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1; 
            sum = sum + x;
        }

        System.out.println(m + " numbers have the sum of: " + sum);
        System.out.println(m + " numbers have the average of: " + (sum/m));

        scanner.close();
    }
}