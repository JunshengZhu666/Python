public class Outer {
    private int id = 10;

    
    public void out() {
        System.out.print("This is an outer method");
    }

    public class Inner {
        public void in() {
            System.out.println("This is an inner method");
        }

        // To get the attributes of outer 
        public void getID() {
            System.out.println(id);
        }
    }
}