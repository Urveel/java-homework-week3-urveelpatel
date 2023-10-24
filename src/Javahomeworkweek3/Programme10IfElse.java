package Javahomeworkweek3;
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/

import java.util.Scanner;

public class Programme10IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter the operation symbol (+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        double result;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("Division by zero is not allowed.");
                return; // Exit the program
            }
        } else {
            System.out.println("Invalid operation symbol.");
            return; // Exit the program
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}







