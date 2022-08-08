package Week2.Monday;

import static java.util.Collections.reverse;

//        Write a program to create an array of 10 integers and then reverse the array.
public class CreateArray {
    public static void main(String[] args) {
        //create an array
        int[] numbers = {6, 9, 8, 0, 7, 5, 1, 3, 2, 4};
//
        //print it
        System.out.println("The original Array is:");

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        System.out.println();


        //reverse the array
        int n= numbers.length;
        int[]temp= new int[10];
        for (int i =numbers.length-1; i >=0;i--){
            temp[numbers.length-i-1]=numbers[i];
        }
        //print it
        System.out.println("The reversed Array is:");

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                System.out.print(temp[i]);
                break;
            }
            System.out.print(temp[i] + ",");

        }
        System.out.println();
        System.out.println("---------------------------------------------------------");

        //Write a program to create an array of strings and then print out the array and strings backwards.
        String[] names= {"saba","muath","aun"};
        System.out.println("The original names Array is:");

        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.print(names[i]);
                break;
            }
            System.out.print(names[i] + ",");
        }
        System.out.println();
        System.out.println();
        //to reserve the array
        String[] sttemp =new  String[3];
        for (int i= names.length-1; i>=0;i--){
            sttemp[names.length-i-1]= reverse(names[i]);
        }
        //print it
        System.out.println("The reversed  names Array is:");

        for (int i = 0; i < sttemp.length; i++) {
            if (i == sttemp.length - 1) {
                System.out.print(sttemp[i]);
                break;
            }
            System.out.print(sttemp[i] + ",");
        }
        System.out.println();
        System.out.println();



    }

    private static String reverse(String name) {
        String tempname="";
        int pointer= name.length()-1;
        while(pointer>=0){
            tempname+=name.charAt(pointer);
            pointer--;
        }
        return tempname;
      //  System.out.println(name);
    }


}

