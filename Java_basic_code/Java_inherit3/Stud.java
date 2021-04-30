public class Stud {

    private static int age;
    private double score; //non-static 

    //A static method
    public static void go() {
        // System.out.println("GoGo");
    }

    public static void main(String[] args) {
        Stud stud = new Stud();
        go();
        
        //Static can be widly used
        System.out.println(stud.age);
       
    }
}