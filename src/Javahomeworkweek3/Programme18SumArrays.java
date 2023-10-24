package Javahomeworkweek3;
//Write a Java program to sum values of an array.
public class Programme18SumArrays {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20};
        int sum = 0;
        for (int i = 0; i <numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum of the elements in the array: "+sum);
    }
}
