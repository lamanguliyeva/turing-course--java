package lesson9;

public class Main {
    public static void main(String[] args) {

        /*System.out.println(User.minAge);
        System.out.println(User.getMinAge());*/

        User u = new User();
        u.setName("Jack");
        //u.name = "John Doe";
        //System.out.println(u.name + "John");
        System.out.println(u.getName());
        System.out.println(u.name);

        /*System.out.println(User.minAge);
        System.out.println(u.getFullName());
        System.out.println(User.getMinAge());

        *//*u.name = "John Doe";
        u.age = 20;*//*

        User u1 = new User("John", 20);
        System.out.println(u1.getFullName());

       // int minAge = User.minAge;*/
    }
}
