public class Demo_Method2 {
    public static void main(String[] args) {

        int max = max (10, 20, 70);
        System.out.println(max);

        
    }

//Comparsion 

    public static double max (double num1, double num2) {

        double result = 0;

        if (num1 == num2){
            System.out.println("Fuck off");
            return 0; // To stop
        }

        if (num1 > num2) {
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }

    public static int max (int num1, int num2, int num3) {

        int result = 0;

        if (num1 + num3== num2){
            System.out.println("Fuck off");
            return 0; // To stop
        }

        if (num1 + num3 > num2) {
            result = num1 + num3;
        }else{
            result = num2;
        }

        return result;
    }
}