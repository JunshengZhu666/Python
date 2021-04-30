import java.util.Scanner;

public class Demo_Switch {
    

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    
    int name = 502;
    System.out.println("Please Inter a name: ");
    
    if (scanner.hasNextInt()){
        name = scanner.nextInt();


    }

    scanner.close();

    switch (name){
        case "502":
        System.out.println("Hello Junsheng");
        break;
        case "Me":
        System.out.println("Fuck off");
        break;
        default;
        System.out.println("Assess denied");

    

    }
}

}