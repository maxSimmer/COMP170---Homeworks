public class digitRange {

    public static int number2(int number) {
        number = Math.abs(number);
        int max = number % 10;
        int min = number % 10;
        number /= 10;
    
        while(number > 0) {
            int number2 = number % 10;
        
            if(number2 > max) {
                max = number2;
            } else if(number2 < min) {
                min = number2;
            }
        
        number /= 10;
    }
    
    return max - min + 1;
        
}
    public static void main(String[] args){
        System.out.println(number2(68437));
    }
}