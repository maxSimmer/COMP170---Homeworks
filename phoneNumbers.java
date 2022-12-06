
import java.util.Scanner; // scanner for user input
public class phoneNumbers {


    public static void main(String[] args){

        // list of names in contact list
        String[] contacts = {"Adam Smith", "George Washington", "Alexander Hamilton", "Thomas Payne",
        "Betsy Ross", "Martha Washington", "Deborah Sampson", "Patience Wright"}; 
        // list of numbers in type long, elements are larger data types
        long[] numbers = {9876543210L, 0, 3129152000L, 9094567890L, 3034061234L, 0, 0, 8133774578L};

        newNumber(numbers, contacts); // call method to add update numbers
        contactList(numbers, contacts); // show contact list


    }
    // method to update number
    public static boolean newNumber(long[] phoneNumbers, String[] name) {
        // initalize scanner 
        Scanner keyboard = new Scanner(System.in);
        String nameInput = "public";
        // phone assumes we are not changing data UNLESS
        boolean dataChange = false;
        boolean nameMatch;
        while(true){ // search for name to update if wanted
            System.out.println("Enter name to update, or enter *Done* to exit: ");
            nameInput = keyboard.nextLine(); // user input
            nameMatch = false; // declare the match as false as we assume we arent updating
            if(nameInput.equals("Done")){
                break; // move on to next method if "Done"
            }
            for(int k = 0; k < name.length; k++){ // go thru array of names if not DONE
                if(nameInput.equals(name[k])){
                    nameMatch = true; // if user input matches name in contact list, update
                    System.out.printf("Enter  a new number for %s: \n",name[k]);

                long prevNumber = phoneNumbers[k];
                long number = keyboard.nextLong(); // intialize new UPDATED NUMBER
                phoneNumbers[k] = number;

                if(phoneNumbers[k] != prevNumber){
                    dataChange = true; // boolean changes as data was CHANGED
                    System.out.println("Number updated!");
                }
            }
        }
        if(!nameMatch){ // if name does NOT match, print its non existance
            System.out.println("Entered name doesn't exist!!");
        }
        

    }
    return dataChange;
    
}
    public static void contactList(long[] phoneNumbers, String[] name){

        // go thru array of phone numbers
        for(int k = 0; k < name.length; k++){

            if(phoneNumbers[k] ==0){ // if the number is 0, the contact doesnt have a number
                System.out.printf("|%20s|\t*Unknown*\t|\n", name[k]); // print unknown w correct spacing
                continue; // continue going thru array of phoneNumbers
            }
            // output swap to type string so it can be printed, got help for this part
            String number = Long.toString(phoneNumbers[k]); // change list of numbers from type long to type string
            String firstPart = number.substring(0, 3); 
            String secondPart = number.substring(3, 7); 
            String remaining = number.substring(7);
            System.out.printf("|%20s|\t(%3s) %s-%s\t|%n",name[k],firstPart, secondPart, remaining);
            
        }
    }
}
