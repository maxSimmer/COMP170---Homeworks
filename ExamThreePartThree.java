import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class ExamThreePartThree{


    public static void main(String[] args) throws FileNotFoundException{
        // create file input of inputstrings
        File myFile = new File("inputStrings.txt");
        //scanner to read file
        Scanner scan = new Scanner(myFile);
        int countLines = 0;
        //String line;
        //String shortLine = new String();;
        //String longLine = new String();


        
        
        // loop thru all the lines and print them
        while(scan.hasNextLine()){
            String readLines = scan.nextLine();
            System.out.println(readLines); // print lines 
            countLines++;  // iterate thru lines and countthem
            
            }
        
        // print number of lines AFTER count
        System.out.println("Number of Lines: " + countLines);


        
    }
    
        
}

