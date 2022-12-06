// 

//
import java.util.Scanner;

public class exam2q2 {
        // main method to call smallestTwo
        public static void main(String[] args) {
                // creating a scanner
                Scanner input = new Scanner(System.in);
                // calling smallestTwo with the scanner 
                smallestTwo(input);
        }
       // static method that holds 1 parameter
       public static void smallestTwo(Scanner input) {
        // initalize 2 integers as the MAXIMUM VALUES 
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        // asking and reading first integer the user inputs
        System.out.print("Please enter any non-negative integer (or negative number required to quit): ");
        int x = input.nextInt();
        // loops as long as the user doesnt input a negative number
        while (x >= 0) { // x has to be greater than 0
                // if x is smaller than smallest, setting current smallest as the second smallest and "x" as newSmallest
                if (x < smallest) { // if x is less than smallest, set secondSmallest to smallest and x as newsmallest
                        secondSmallest = smallest;
                        smallest = x;
                }
                // else if x is smaller then smallest, update secondSmallest to x
                else if (x < secondSmallest) {
                        secondSmallest = x;
                }
                // asking user for the next number
                System.out.print("Please enter any non-negative integer (or negative number required to quit): ");
                x = input.nextInt(); // scan if its another integer
        }
        // prints the smallest and nextSmallest
        System.out.println("The smalllest is " + smallest + " and the next smallest is " + secondSmallest);
}
}
    

