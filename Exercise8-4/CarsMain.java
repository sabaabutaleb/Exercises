//For this exercise, you will pick a real-life object to write some java code about.
//        - Example: superhero, food, etc.
//        - Requirements
//        - At least 5 member variables
//        - At least 3 methods
//        - At least 2 constructors, separate from the 3 methods
//        - Also write some code to try out some of the methods and variables you created
//        - Override either the toString or equals method and write code to test those out
//        - Since this project will have multiple files, you'll want to upload the entire project.
//        - In intelliJ, you can right-click the left side-bar, open-in, and then pick explorer (or "finder" for Mac users)
//        - Then, navigate to the folder that contains the entire project
//        - Copy the project and paste it in the Github repo that you've been uploading your exercises in
//        - Alternatively, you can just create the project in the repository to begin with, removing the need to copy/paste it
//        - Finally, push it up and send me the link on Teams (email if Teams is not set up yet)
//        - Feel free to talk with your fellow associates for ideas/help, but you must submit your own code
//
package Thursday.Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CarsMain {

    public static void main(String[] args) {
        Car car1 =new Car("Honda","Silver",1997,"Sedan",200,"Benzin");
        Car car2= new Car("nissan","Gray",2020,"SUV",250,"Benzin");
        Car car3=new Car("Toyota","white",2021,"Sport",300,"Dizel");
        Car car4=new Car("Ford",2020);
        Car car5=new Car("Honda",2021);
        Car car6=new Car("Fox","Gray",2020,"SUV",250,"Benzin");
        System.out.println(car1.name);
        String carString =car1.toString();
        System.out.println(carString);
        System.out.println((car2.toString()));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your selection:\n1. Honda.\n2.Nissan.\n3Toyota.\n4.Ford.\n");
//        String selection= scanner.nextLine();
        System.out.println(car4.getColor("nissan")+"  the only color for this car");
        if (car4.getColor("Ford")== null) System.out.println(car4.name+" has no data .");
        if (car5.type.isEmpty()) System.out.println(car5.name+" has no data .");

        System.out.println("Is Honda color the same as Nissan color? "+ car1.color.equals(car2.color));
        System.out.println("Is Fox fuel type the same as Nissan fuel type? "+ car6.fuel.equals(car2.fuel));
        System.out.println("we have  two cars of Honda :"+ car1.name.concat(car5.name));








    }

}
