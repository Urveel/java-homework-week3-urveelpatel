package Javahomeworkweek3;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Programme17ArraysAndString {
    public static void main(String[] args) {
        int [] numericArray = {45,12,78,32};
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array");
        for (int num: numericArray){
            System.out.println(num + "");
        }
        String[]stringArray = {"apple","banana","grape "};
        Arrays.sort(stringArray);
        System.out.println("\nSorted String Array:");
        for (String Str : stringArray){
            System.out.println(Str + "");
        }
    }
}
