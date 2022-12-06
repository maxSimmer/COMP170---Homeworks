import java.util.Scanner; // scanner import

public class ExamThreePartFour {

    public static void main(String[] args){
        // create scanner for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 99: ");
        int userNumber = scan.nextInt();

        // check if user input is correct 10-99
        if (userNumber < 10){ // if less than 10 try again
            System.out.println("Incorrect Input, Try Again: ");
            userNumber = scan.nextInt();
        } else if (userNumber > 99) { // if greater than 99 try again
            System.out.println("Incorrect Input, Try Again: ");
            userNumber = scan.nextInt();
        } else { // else call method to check digits
            if(isDifferent(userNumber)){
                System.out.println("Your number has two digits the same"); // if true
            } else{
                System.out.println("Your number has different digits"); // if false
            }
        }


        }
    
        // method to check if digits r the same (checking if palindrome pretty much)
        public static boolean isDifferent(int userNumber) {
            int num = userNumber; // userNumber goes to new variable num 
            int reverse = 0; // number backwards is reversed and declared to 0

            // figure out what the reverse is 
            while (num != 0) {
                int remainder = num % 10; // modular division to find remainder when div by 10
                reverse = reverse * 10 + remainder; // get rid of division by multiplying then adding the leftover
                num = num / 10; // number div by 10
            }
    
            // check if num/10 is equal to the leftover remainder
           
            if (userNumber == reverse) { // if equal return true
                return true;
            }
            return false; // if not equal return false 
        }
    
}
