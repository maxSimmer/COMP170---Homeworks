public class printTriangleType {

    public static void printType(int x, int y, int z){
        if (x == y && y ==z){
            System.out.println("equilateral");
        }
		else if ( (x == y && y != z) 
		       || (x == z && z != y) 
		       || (y == z && x != z)) {
			System.out.println("isosceles");
               }
		else {
			System.out.println("scalene");
		}
    

    if ( (x + y < z) || (x + z < y) || (y + z< x) ) {
        System.out.println ("throws IllegalArgumentException -- > see source code");
    }
}
    public static void main(String[] args){
    printType(5, 7, 7);
    printType(6, 6, 6);
    printType(5, 7, 8);
    printType(2, 18, 2);
    }
    
}
