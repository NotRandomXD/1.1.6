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
       
        double startNumber = negDouble;
        /* starting number you choose
        */

        /* 
        ((2*startNumber + 6)/2)-startNumber
        calculation
        */
        System.out.println(startNumber);
        double calc = (2*startNumber);
        System.out.println(calc);
        double calc2 = calc + 6;
        System.out.println(calc2);
        double calc3 = calc2/2;
        System.out.println(calc3);
        double calc4 = calc3 - startNumber;
        System.out.println(calc4);
        /* 
        aarav worked on doubles and initilizing variables 
        arnesh worked on calculating the variables
        */
    }
}