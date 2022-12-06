public class exam1problem2{
    public static void stars(int size){
        // this prints the amount of rows
        for (int i = 1; i <= size; i++){
            // prints the spaces before the stars
            for(int k = size; k >= i; k--){
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            // puts stars on a new line
            System.out.println();
        }
    }
    public static void printSize(int size){
        // prints the number of spaces before printing the size
        for (int x=0; x <= size-2; x++){
            System.out.print(" ");
        }
        System.out.print("S=" + size);
    }
    public static void main(String[] args){
        stars(8);
        printSize(8);
    }
}