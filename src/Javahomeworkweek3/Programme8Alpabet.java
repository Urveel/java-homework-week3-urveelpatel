package Javahomeworkweek3;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;

public class Programme8Alpabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        if (alphabet >= 'A' && alphabet <= 'F') {
            String city;
            switch (alphabet) {
                case 'A':
                    city = "London";
                    break;
                case 'B':
                    city = "Manchester";
                    break;
                case 'C':
                    city = "Liverpool";
                    break;
                case 'D':
                    city = "Brighton";
                    break;
                case 'E':
                    city = "Newcastle";
                    break;
                case 'F':
                    city = "Hull";
                    break;
                default:
                    city = "Invalid Entry";
            }
            System.out.println("City Name: " + city);
        } else {
            System.out.println("Invalid Entry");
        }
        scanner.close();

    }
}


