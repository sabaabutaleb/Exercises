package Week2.Monday;

import java.sql.SQLOutput;
import java.util.Arrays;

import static java.util.Collections.reverse;

//        Write a program to create an array of 10 integers and then reverse the array.
public class CreateArray {
    public static void main(String[] args) {
        //create an array
        int[] numbers = {6, 9, 8, 0, 7, 5, 1, 3, 2, 4};
//
        //print it
        System.out.println("The original Array is:");
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        //reverse the array
        int n= numbers.length;
        int[]temp= new int[10];
        for (int i =numbers.length-1; i >=0;i--){
            temp[numbers.length-i-1]=numbers[i];
        }
        //print it
        System.out.println("The reversed Array is:");
        System.out.println(Arrays.toString(temp));

//
        System.out.println();
        System.out.println("---------------------------------------------------------");

        //Write a program to create an array of strings and then print out the array and strings backwards.
        String[] names= {"saba","muath","aun"};
        System.out.println("The original names Array is:");
        System.out.println(Arrays.toString(names));

        System.out.println();
        //to reserve the array
        String[] sttemp =new  String[3];
        for (int i= names.length-1; i>=0;i--){
            sttemp[names.length-i-1]= reverse(names[i]);
        }
        //print it
        System.out.println("The reversed  names Array is:");
        System.out.println(Arrays.toString(sttemp));

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

