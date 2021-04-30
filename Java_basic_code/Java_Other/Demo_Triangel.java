public class Demo_Triangel {
    public static void main(String[] args) {
        // Print a triangel for 5 lines

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("MJY");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("MJY");
            }
                System.out.println();
        }
    }
}
    