package Javahomeworkweek3;
//Write a Java program to calculate the average value of array elements.
public class Programme19AverageArrays {
    public static void main(String[] args) {
        int[] numbers = {5,10};
        int sum = 0;
        int count = numbers.length;
        for (int i = 0; i < count; i++){
            sum += numbers[i];
        }
        double average = (double)sum / count;
        System.out.println("Average of the elements in the array: " + average);
    }

}
