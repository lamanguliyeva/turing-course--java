package lesson10;

public class User {
    /*String name;   //default
    //protected String name;
    //public String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }*/



    private String privateField;
    String defaultField;
    protected String protectedField;
    public String publicField;

    public void printFields() {
        System.out.println(privateField);
        System.out.println(defaultField);
        System.out.println(protectedField);
        System.out.println(publicField);
    }
}

class Another {
    public void printFields() {
        User u = new User();
        //System.out.println(u.privateField); //icaze vermir
        System.out.println(u.defaultField);
        System.out.println(u.protectedField);
        System.out.println(u.publicField);
    }
}
