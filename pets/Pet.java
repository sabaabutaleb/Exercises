package Wednesday.pets;

import org.w3c.dom.ls.LSOutput;

public class Pet {
    int eyes;
    int legs;
    String name;
    String owner;
    String sound;
    void speak(){
        System.out.println("meaw");
    }
    int getlegs(){
        return legs;
    }
    void eat(int weight){
        System.out.println(name+ " eats "+ weight +" ounces");
    }
    public Pet() {
        // since we have no values being passed in, we can just set up some default values:
        this.name = "default name";
        this.owner = "default owner";
        this.eyes = 2;
        this.legs = 4;
    }
    public Pet(int eyes, int legs, String name, String owner ){
        this.name = name;
        this.owner = owner;
        this.eyes = eyes;
        this.legs= legs;

    }


}
