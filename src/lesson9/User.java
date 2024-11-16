package lesson9;

public class User {

    static final int minAge = 0;
    //static int minAge = 12;

    //final String name;
    String name;
    int age = 15;

    static {
        System.out.println("Static Initializer");
        //minAge = 14;
    }

    {
        System.out.println("Instance Initializer");
        //minAge = 18;
        //name = "John";
        age = 18;
    }

    public User(){
        name = "Default User";
        System.out.println("Default Constructor");
    }

    public User(String name, int age) {
        System.out.println("Custom Constructor");
        this.name = name;
        this.age = age;
    }

    public static int getMinAge() {
        return minAge;
    }

    public String getFullName() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Changed User");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
