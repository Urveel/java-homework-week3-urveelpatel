package Javahomeworkweek3;

import java.util.Scanner;
public class Programme7Sales {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Sales ID: ");
            int salesId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Seller's Name: ");
            String sellerName = scanner.nextLine();
            System.out.print("Enter Sales Amount: ");
            double salesAmount = scanner.nextDouble();
            System.out.print("Enter Salary Basic: ");
            double salaryBasic = scanner.nextDouble();

            // Calculate sales commission
            double salesCommission = 0.0;
            if (salesAmount >= 50000) {
                salesCommission = salesAmount * 0.35;
            } else if (salesAmount >= 30000) {
                salesCommission = salesAmount * 0.20;
            } else if (salesAmount >= 20000) {
                salesCommission = salesAmount * 0.10;
            } else if (salesAmount >= 10000) {
                salesCommission = salesAmount * 0.05;
            } else {
                salesCommission = salesAmount * 0.02;
            }

            // Calculate total earnings (salary basic + sales commission)
            double totalEarnings = salaryBasic + salesCommission;

            // Print the result
            System.out.println("_______________________________");
            System.out.println("|      Sales Commission       |");
            System.out.println("|______________________________|");
            System.out.println("| Sales ID: " + salesId);
            System.out.println("| Seller's Name: " + sellerName);
            System.out.println("| Sales Amount: " + salesAmount);
            System.out.println("| Salary Basic: " + salaryBasic);
            System.out.println("|______________________________|");
            System.out.println("| Sales Commission: " + salesCommission);
            System.out.println("| Total Earnings: " + totalEarnings);
            System.out.println("|==============================|");

            scanner.close();
        }
    }


