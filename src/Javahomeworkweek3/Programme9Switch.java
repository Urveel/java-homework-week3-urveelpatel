package Javahomeworkweek3;

import java.util.Scanner;

public class Programme9Switch {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
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

        scanner.close();

    }
}



