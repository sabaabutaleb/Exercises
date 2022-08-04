package Wednesday.pets;

public class PetStore {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet pet2 = new Pet ();
        pet1.name = "Tommy";
        pet1.legs = 4;
        pet1.owner= "saba";
        pet1.eyes=2;
        pet1.speak();
        System.out.println("Tje first pet is: "+ pet1.name);
        System.out.println("my owner is: "+ pet1.owner);
        System.out.println(" I have : "+pet1.getlegs()+ "legs");
        pet1.eat(10);
        System.out.print("and say ");
        pet1.speak();

        pet2.name = "cres";
        pet2.legs = 4;
        pet2.owner= "aun";
        pet2.eyes=2;
        pet2.speak();
        System.out.println("Tje sec pet is: "+ pet2.name);
        System.out.println("my owner is: "+ pet2.owner);
        pet1.eat(20);
        System.out.print("and say  ");
        pet1.speak();
        Pet pet3 = new Pet();
        Pet pet4 =new Pet(2,4,"tom","aun");
        System.out.println("Tje 4th pet is: "+ pet4.name);
        System.out.println("my owner is: "+ pet4.owner);
        System.out.println("I have: "+ pet4.legs + " legs");
        System.out.println("I have "+ pet4.eyes+ " eyes");

        System.out.print("and ");
        pet4.eat(15);

    }
}
