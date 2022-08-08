
package Friday;

        import java.util.Scanner;
        import java.util.Random;
public class RandomMain{
    public static void main(String[] args) {
        //ask the user to select
        System.out.println("Please enter your Random choice: \n" +
                "1.Int\n2.Double\n3. Boolean");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        Random rand = new Random();
        if (selection==1)
            System.out.println("Your choice: "+rand.nextInt());
        if (selection==2)
            System.out.println(rand.nextDouble());
        if (selection==3)
            System.out.println(rand.nextBoolean());

        //according to his selection we call the certain method

    }

}
