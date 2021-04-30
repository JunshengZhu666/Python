public class Application {
    public static void main(String[] args) {
        
        Object object = new Student();

        //Algor:
        //System.out.println( X instanceof Y) = Boolean 

        System.out.println(object instanceof Student); //T
        System.out.println(object instanceof Person); //T
        System.out.println(object instanceof Object); //T
        System.out.println(object instanceof Teacher); //F
        System.out.println(object instanceof String); //F
    
    
        // Transformation of the type 

        // //From high to low
        Person P1 = new Student();
        Student S1 = (Student) P1;
        S1.go();

        Student student = new Student();
        student.go();
    

    }
}