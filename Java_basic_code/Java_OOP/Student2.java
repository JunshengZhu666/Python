public class Student2  {

    private String name; 
    private int id;
    private int age;
    private char sex;

    //Use get and set to make it public
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age =  3;
        }else {
            this.age = age;
        }
    }

}