package Javahomeworkweek3;

import java.util.Scanner;
public class Programme13Week {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (1 to 7): ");
            int dayNumber = scanner.nextInt();

            String dayName;

            switch (dayNumber) {
                case 1:
                    dayName = "MONDAY";
                    break;
                case 2:
                    dayName = "TUESDAY";
                    break;
                case 3:
                    dayName = "WEDNESDAY";
                    break;
                case 4:
                    dayName = "THURSDAY";
                    break;
                case 5:
                    dayName = "FRIDAY";
                    break;
                case 6:
                    dayName = "SATURDAY";
                    break;
                case 7:
                    dayName = "SUNDAY";
                    break;
                default:
                    dayName = "Invalid Entry - Week contains 1 to 7 days";
            }

            System.out.println("Day of the week: " + dayName);

            scanner.close();
        }
    }


