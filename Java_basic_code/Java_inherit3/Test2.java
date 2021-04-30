public class Test2 {
    public static void main(String[] args) {
    
        int a = 1;
        int b = 0;

        try {

            if (b == 0) {
                throw new ArithmeticException();
            }

        } finally {
            System.out.println("exit finally");
        }
    }
}