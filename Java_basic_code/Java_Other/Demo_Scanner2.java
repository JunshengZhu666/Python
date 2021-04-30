import java.util.Scanner;

public class Demo_Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Receive data from users
        int i = 0;
        float f = 0.0f;

        System.out.println("Please Inter an Integer: ");
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("Integer: " + i);
        }else {
            System.out.println("Not Integer: " + i);
        }

        
        System.out.println("Please Inter an Float: ");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("Float: " + f);
        }else {
            System.out.println("Not Float: " + f);
        }

        scanner.close();
    }
}