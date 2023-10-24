package Javahomeworkweek3;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Programme12AlphabetOrSymbol {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a value:  ");
        String input = scanner.nextLine();
        if (input.length()==1) {
            char character = input.charAt(0);
            if (Character.isDigit(character)) {
                System.out.println("Input is a number.");
            } else if (Character.isLetter(character)) {
                System.out.println("Input is an alphabet.");
            } else {
                System.out.println("Input is a symbol.");
            }
        } else {
            System.out.println("Input is more than one character and is considered a symbol.");
        }

        scanner.close();
    }
}
