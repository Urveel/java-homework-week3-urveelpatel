package Javahomeworkweek3;
import java.util.Scanner;

public class Programme2LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + "  is a leap year.");
        } else {
            System.out.println(year + "  is not a leap year.");
        }
        scanner.close();
    }
}


