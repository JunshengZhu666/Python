public class Demo_opp2 {
    
    public static void main(String[] args) {
        // //Instance

        // Student xiaoming = new Student();
        // Student xh = new Student();

        // xiaoming.name = "xiaoming";
        // xiaoming.age = 13;

        // System.out.println(xiaoming.name);
        // System.out.println(xiaoming.age);

        // System.out.println(xh.name);
        // System.out.println(xh.age);

        // //Constructor
        // System.out.println("==========");
        // System.out.println("Constructor");
        // //Using 'new' to call constructor
        // Person person = new Person("Junsheng");
        // System.out.println(person.name);

        // //Memory -Pet instance
        // System.out.println("==========");
        // System.out.println("Memory - Pet instance");
        // Pet dog = new Pet();
        // dog.name = "Money";
        // dog.age = 3;
        // dog.shout();

        // System.out.println(dog.name);
        // System.out.println(dog.age);

        //encapsulation
        System.out.println("==========");
        System.out.println("encapsulation");

        Student2 s1 = new Student2();
        s1.setName("Junsheng");
        System.out.println(s1.getName());

        s1.setAge(999);
        System.out.println(s1.getAge());
    }
}