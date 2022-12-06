
public class holyDigits {
    public static void main (String[] args){

        int address = 0;
        int thousands = 0;
        int hundreds=0;
        int tens=0;
        int ones=0;

        final int MINIMUM=1000;
        final int MAXIMUM=9999;

        boolean isUniqueNumber=false;
        boolean isTenequalsFiveTimes=false;
        boolean isEven=false;
        boolean isSum=false;

    while (!isUniqueNumber && !isTenequalsFiveTimes && !isEven && !isSum){   
        address = (int) (Math.random() * (MAXIMUM - MINIMUM) + MINIMUM);
            thousands = (address / 1000) % 10;
            hundreds = (address / 100) % 10;
            tens = (address / 10) % 10;
            ones = address % 10;
        if ((thousands!=hundreds) && (thousands!=tens) && (thousands!=ones) && (hundreds!=tens) && (hundreds!=ones) && (tens!=ones))
            isUniqueNumber=true;

        if (isUniqueNumber && (thousands==5*tens)) 
            {
            isTenequalsFiveTimes=true;
        
    if (address%2!=0) {
            isEven=true;
            if((thousands+hundreds+tens+ones) == 23)
                    isSum=true;
            else
            {

            isUniqueNumber = false;
            isTenequalsFiveTimes = false;
            isEven = false;
            isSum = false;
                }
            } else {
                isUniqueNumber=false;
                isTenequalsFiveTimes=false;
                isEven=false;
            }
            } else {
                isUniqueNumber=false;
        }
    }
System.out.println("4-Digit Number");
System.out.println("Conditions: ");
System.out.println("All digits are different ");
System.out.println("Thousands = 5 * Tens place");
System.out.println("Number is even");
System.out.println("Sum of the digits = 23");
System.out.println("The Number is: "+ address);
    }
}

