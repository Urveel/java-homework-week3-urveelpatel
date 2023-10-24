package Javahomeworkweek3;
//Write a Java program to test if an array contains a specific value.

public class Programme20ArraysValues {
    public static void main(String[] args) {
        int[] numbers ={5, 10};
        int specificValue = 10;
        boolean found = false;
        for (int number: numbers){
            if (number == specificValue){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The Array contains the specific value: "+specificValue);
            System.out.println(" The Array contains the specific value: "+specificValue);
        }
    }
}
