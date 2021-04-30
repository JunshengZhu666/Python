public class Test {
    //The method that may exception

    static void test(int a) throws MyException {

        System.out.println("The parameter is: " + a);

        if (a > 10) {
            throw new MyException(a); //throw out
        }

        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException: " + e);
        }
    }
} 