import java.util.Random;

public class ExamTHREEErrorsToFixbSp22
{
	/*
	This .java file contains both compile time and run time errors. Fix them so the code compiles and runs.
	File contains at least 5 errors
	Make your corrections match the original intent of the code (What the programmer intended)
	 */
	public static void main(String[] args) 
	{
		String aName;
		String bName;
		String[] myFriends = {"John","Jane", "Jake", "Janice"};
		aName = "John Smith";
		bName = "Jane Doe";

		//Welcome
		System.out.println("Here's some programming I learned in COMP 170");
		//Give a random value to a boolean variable
		Random random = new Random();
		random.nextBoolean();
		//Let's call a method that returns a value and print out the results
		sayHello(aName);
		//Use a helper method to compare two names
		System.out.println("Comparing " + aName + " and " + bName);


		if ( compareNames(aName, bName) ){	
			System.out.println("Names match");
		} else {
			System.out.println("Names do not match");
		}
		//Print out all my friends
		for(String name : myFriends ) {
			System.out.println( name );
		}
	}

	public static String sayHello(String aName ) {
		return "Hello there " + aName;
	}

	public static boolean compareNames( String a, String b){
		return a == b;
	}
}