public class printssquare {

    public static void printSquare(int low, int high){
        for (int x = low; x <= high; x++){
            for (int k = x; k <= high; k++){
                System.out.print(k);
            }
            for(int k = low; k < x; k++){
                System.out.print(k);
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        printSquare(3, 7);
    }
}
