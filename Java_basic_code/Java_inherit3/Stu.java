public class Stu {

    private static int age;
    private double score; //non-static 

    public static void main(String[] args) {
        Stu stu = new Stu();
        
        //Static can be widly used
        System.out.println(Stu.age);
    }
}