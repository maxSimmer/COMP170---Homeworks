import java.util.*; // import scanner method
public class exam2q3 {
    // main method
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        double target = Double.MAX_VALUE; // initalizes target as the highest value
        // while loop to determine if its a double 1 - 10
        while(true){
            System.out.print("Please enter any number, whole or fractional between 0 and 10: ");
            target = input.nextDouble();
            // if input > 10 or not a double, ask again
            if(target<0.00 || target > 10.00){
                System.out.println("Incorrect input - Please enter any number, whole or fractional between 0-10");
                continue;
            }
            // if 0-10 get outta loop
            break;
        }
        // call fractionSum
        fractionSum(target);
        // close scanner
        input.close();
    }
        // fraction sum method, takes scanner type double as the parameter
        public static void fractionSum(Double input){

            double x = 1.0; // set x to 1
            int denom = 2; // set y to 2 for the first denominator

            if (input < 1.0){
                return; // if less than 1 return 
            }
            System.out.print("1"); // print 1.0 if 1

            while(input > x){ // while user input is greater than 1
                x += 1.0/denom;// math for fraction (1/denominator)
                System.out.print(" + " + "1/" + denom); // print the fraction
                denom++; // increase denominator
            }
        System.out.print(" =  " + x); // print sum of fractions
    
    }
}

