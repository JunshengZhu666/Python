public class Inner_Outer {
    public static void main(String[] args) {
        
        Outer outer = new Outer();

        //Use outer to instanlize the innner 
        Outer.Inner inner = outer.new Inner();
        inner.in();

        //get id
        inner.getID();
        
    }
}