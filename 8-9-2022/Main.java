//You will create a java project that makes use of Inheritance, Polymorphism, and Encapsulation
//
//        Requirements:
//        At least 1 example of inheritance in the project (you will need at least 2 classes for this)
//        At least one class must exemplify encapsulation, preferably all of them
//        All fields are private
//Public getters and setters
//        At least one example of overriding a method and one example of overloading
package Week2.Tuesday.Exercise;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person();
        Person p2= new Person();
        Person p3= new Person();

        p1.setFirstname("saba");
        p1.setLastname("rahim");
        p2.setFirstname("aun");
        p2.setLastname("sami");
        p3.setFirstname("luna");
        p3.setLastname("jimmy");

        System.out.println(p1.toString());
       CollageStudent s1= new CollageStudent();
        CollageStudent s2= new CollageStudent();
        CollageStudent s3= new CollageStudent();

        double []grade1= {20.0,60.0,35.0};
        double []grade2= {21.0,60.80,35.5};

//

        s1.setFirstname(p1.getFirstname());
        s1.setLastname(p1.getLastname());
        s1.setAge(19);
        s1.setMajor("CS");
        s1.setId(1);
        s1.setGrades(grade1);

        s2.setFirstname(p2.getFirstname());
        s2.setLastname(p2.getLastname());
        s2.setAge(19);
        s2.setMajor("Marketing");
        s2.setId(2);
        s2.setGrades(grade2);

//
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println(s1.addGrades(10,22,30));
        System.out.println(s2.addGrades(20.5,12.8,13.0));
   }
}
