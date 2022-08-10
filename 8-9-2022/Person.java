package Week2.Tuesday.Exercise;

public class Person {
    //declare variables as private(encapsolation)
    private String firstname;
    private String lastname;
    private int age;
    //create default constructor
    public Person(){

    }
    //create  constructor with parameter
    public Person(String firstname, String lastname, int age){
        this.firstname= firstname;
        this.lastname=lastname;
        this.age=age;
    }
    //create setters and getters
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

//    @Override
//   public void toString(){

    @Override
    public String toString() {
        return "In Person class{" +
                "name= " + firstname+ " " + lastname +"}";
    }
}

