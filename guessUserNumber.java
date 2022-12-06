import java.util.*;

public class guessUserNumber {

    public static void main(String[] args) {
        int randNum;
        int guess = 0;

        char hint;
        char Answer;  
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("This program has you, the user, choose a number");
        System.out.println("between 1 and 10. Then I, the computer, will try");
        System.out.println("my best to guess it.");
          
        randNum = 1 + random.nextInt(10);
        guess++;
        
        System.out.print("Is it " + randNum + "? (y/n) ");
        Answer = input.next().charAt(0);  
        
        while(Answer != 'y') {

         System.out.print("Is your number higher than " + randNum + "? (y/n) ");
         hint = input.next().charAt(0);
         
         if(hint == 'y') {
          randNum = 1 + randNum + random.nextInt(10 - randNum);
         } else {
          randNum = 1 + random.nextInt(randNum - 1);
         }
         guess++;
         
         System.out.print("Is it " + randNum + "? (y/n) ");
         Answer = input.next().charAt(0);
        }
        input.close();
        
        System.out.println("I got your number of " + randNum + " correct in " + guess + " guess.");
       }
      }
    

