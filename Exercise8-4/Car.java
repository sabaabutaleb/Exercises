package Thursday.Exercise;

import java.util.Locale;

public class Car {
    String name;
    String color;
    int model;
    String type;
    int speed;
    String fuel;

    public Car(String name, String color, int model, String type, int speed, String fuel) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuel = fuel;
    }

    public Car(String name, int model) {
        this.name = name;
        this.model = model;
        this.type = "";
    }

    public int getspeed(String name) {
        return speed;
    }

    public String getFuelType(String name) {
        return fuel;
    }

    public String getColor(String name) {
        return color;
    }

    @Override
    public String toString() {
        String description = this.name.toUpperCase();
        description += ":\n" + "Description: \n" + this.color + ", " + this.model + ", " + this.type + ", " + this.fuel + ".\n";
        System.out.println("------------------------------------------------------------");
        return description;

//        System.out.println("this Car is :"+ this.name.toUpperCase());
//        System.out.println("Description: " +this.color+ this.model+" Year model"+ this.type+" "+ this.fuel);

    }

}

