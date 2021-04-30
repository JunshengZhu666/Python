import java.util.Scanner;

public class Demo_if2 {
    public static void main(String[] args) {
        //if score > 60 then pass, else fail
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the score: ");
        int score = scanner.nextInt();

        if (score >= 100) {
            System.out.println("Erorrs Reported");
        }else if(score >= 90) {
            System.out.println("A");
        }else if(score >= 80) {
            System.out.println("B");
        }else if(score >= 60) {
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }

        scanner.close();
    }
}
