package Javahomeworkweek3;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Programme1OddOrEven {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String result= (number % 2==0)? "even": "odd";
        System.out.println("The input number is " + result+ ".");//ternary operator
        scanner.close();
    }

}
