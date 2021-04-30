import java.util.Scanner;

public class Demo_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in: " );

        String s = scanner.nextLine();

        if (s.equals("Hello")){
            System.out.println(s);
        }

        System.out.println("End");
        scanner.close();
    }
}

