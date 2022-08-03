package Wednesday;

import java.util.Scanner;

public class GradeExercise {
    public static void main(String[] args) {
        int result =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your result: ");
        result = scanner.nextInt();
        if (result >90)
            System.out.println("Your grade is : A");
            else if (result >80)
                System.out.println("Your grade is : B");
                else if (result >70)
                    System.out.println("Your grade is : C");
                    else if (result >60)
                        System.out.println("Your grade is : F");
                        else
                        System.out.println("You failed");



    }
}
