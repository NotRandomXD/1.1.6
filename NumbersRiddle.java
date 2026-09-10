public class NumbersRiddle
{
    public static void main(String[] args){
        int posInteger = 2;
        int negInteger = -2;
        int one = 1;
        int zero = 0;
        double posDouble = 2.2;
        double negDouble = -2.2;
        /* initilizing variables
        */
       
        int startNumber = posInteger;
        /* starting number you choose
        */

        /* 
        ((double + 6)/2)-double
        calculation
        */
        System.out.println((double)startNumber);
        double calc = startNumber + 6;
        System.out.println(calc);
        double calc2 = calc/2;
        System.out.println(calc2);
        double calc3 = calc2 - startNumber;
        System.out.println(calc3);
    }
}