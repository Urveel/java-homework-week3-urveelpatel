package Javahomeworkweek3;
//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
//_______________________________
//| |
//| Mark Sheet |
//|_______________________________|
//| Name : Jay |
//| Roll No: 08 |
//|_______________________________|
//| Subjects : Marks |
//|_______________________________|
//| Math : 98 |
//| Science : 90 |
//| English : 85 |
//|_______________________________|
//| Total : 273 |
//|_______________________________|
//| Percentage : 91.0 |
//| Result : Pass |
//| Grade : A+ |
//|_______________________________|

import java.util.Scanner;


public class Programme3Marksheet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Input student information
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();


        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();


        // Input marks for Math, Science, and English
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();


        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();


        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();


        // Check if marks are in the valid range (0-100)
        if (isValidMarks(mathMarks) && isValidMarks(scienceMarks) && isValidMarks(englishMarks)) {
            // Calculate total marks
            int totalMarks = mathMarks + scienceMarks + englishMarks;


            // Calculate percentage
            double percentage = totalMarks / 3;


            // Determine the result and grade
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade = getGrade(percentage);


            // Print the mark sheet
            System.out.println("_____________________________");
            System.out.println("|                            |");
            System.out.println("|         MarkSheet          |");
            System.out.println("|                            |");
            System.out.println("|   Name:" + studentName + "                  |");
            System.out.println("|  RollNo:" + rollNumber + "                 |");
            System.out.println("|                            |");
            System.out.println("|----------MARKS-------------|");
            System.out.println("|                            |");
            System.out.println("|  Math    :" + mathMarks +"               |");
            System.out.println("| Science  :" + scienceMarks+"               |");
            System.out.println("| English  :" + englishMarks + "               |");
            System.out.println("|----------------------------|");
            System.out.println("| Total Marks:" + totalMarks + "            |");
            System.out.println("|____________________________|");
            System.out.println("| Percentage:" + percentage + "            |");
            System.out.println("| Resul  t:" + result + "              |");
            System.out.println("| Grade : " + grade + "                  |");
            System.out.println("|____________________________|");
        } else {
            System.out.println("Invalid Input. Marks should be between 0 to 100.");
        }


        scanner.close();
    }


    // Function to check if marks are in the valid range
    private static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }


    // Function to determine the grade based on the percentage
    private static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "D"; // Failing grade
        }
    }
}



