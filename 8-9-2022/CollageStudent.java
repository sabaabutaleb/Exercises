package Week2.Tuesday.Exercise;

import java.util.Arrays;

public class CollageStudent extends Student{
        private int id;
        private String major;
        private double[] grades;
        public CollageStudent(){

        }

//the constructor inherits from the student cladd
        public CollageStudent(String firstname, String lastname, int age, int id, String major, double[] grades) {
            super(firstname, lastname, age, id);
            this.major = major;
            this.grades = grades;
        }
        //overload the constructor to rearrange the parameters and remove age
        public CollageStudent( int id,String major,String firstname, String lastname,  double[] grades) {
            super(id,firstname, lastname);
            this.id = id;
            this.major = major;
            this.grades = grades;
        }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "CollageStudent{" +
                "id=" + getId() +
                ", major='" + major + '\'' +
                ",Name= '" + super.getFirstname()+" "+ super.getLastname()+
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public double addGrades(double a, double b, double c){
            double grade;
            return grade= a+b+c;
    }
    public int addGrades(int a, int b, int c){
        int grade;
        return grade= a+b+c;
    }




}
