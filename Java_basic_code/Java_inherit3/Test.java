public class Test {
    public static void main(String[] args) {
    
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch( ArithmeticException e) { //catch exception 
            System.out.println("Exception: Cannot compute X/0");
        } catch( Exception ex) {
            System.out.println("Exception");
        } catch( Throwable t) {
            System.out.println("Throwable");
        }
        
        finally { //deal with afterwards, 
            System.out.println("Finally");
        }
        
    }
}