public class MyException extends Exception {
    
    //If the num > 10, exception
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    //toString: print the information
    @Override
    public String toString() {
        return "MyException{" + detail + '}';
    }
}