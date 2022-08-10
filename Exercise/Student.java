package Week2.Tuesday.Exercise;

public class Student extends Person{
    private int id;
    public Student(){

    }

    public Student(String firstname, String lastname, int age, int id) {
        super(firstname, lastname, age);
        this.id = id;

    }
    //overload the constructor adding id to the parameters
    public Student( int id,String firstname, String lastname) {
        //super(firstname, lastname, age);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
