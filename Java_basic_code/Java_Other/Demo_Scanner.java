
import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args) {
        
        //bulid a scanner object 
        Scanner scanner = new Scanner (System.in);

        System.out.println("Use next to receive");

        //determine if the user are typing
        if (scanner.hasNext()){
            //Use next to receive
            String str = scanner.next(); // program will wait for the users
            System.out.println("The output context: " + str);
        }

        System.out.println("==============================");

        System.out.println("Use nextLine to receive");

        //determine if the user are typing
        if (scanner.hasNextLine()){
            //Use next to receive
            String str = scanner.nextLine(); // program will wait for the users
            System.out.println("The output context: " + str);
        }

        System.out.println("+++++++++++++++++++++++++++++++++");

        System.out.println("Use nextLine to receive");

        //determine if the user are typing
        if (scanner.hasNextLine()){
            //Use next to receive
            String str = scanner.nextLine(); // program will wait for the users
            System.out.println("The output context: " + str);
        }

        scanner.close();
    }
}