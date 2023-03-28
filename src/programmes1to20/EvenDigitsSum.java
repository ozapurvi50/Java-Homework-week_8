package programmes1to20;                                                           //Package name

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.  The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class EvenDigitsSum {                                                        //Class name
    public void getEvenDigitSum(int number) {                                      //Instance method
        int oriNumber = 0;                                                         //Defining value to integers
        int digit, sum = 0;

        while (number != 0) {                                                      //While loop
            digit = number % 10;                                                   //Defining value to integers
            if (digit % 2 == 0)                                                    //if condition applied
                sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of even digits of number " + oriNumber + "  is: " + sum);  // Print statement with variables value
    }

    public static void main(String[] args) {                                    //Main method
        EvenDigitsSum eds = new EvenDigitsSum();                                //Object creation
        eds.getEvenDigitSum(123456789);                                 //calling method through object and defining value
        eds.getEvenDigitSum(252);                                       //calling method through object and defining value
        eds.getEvenDigitSum(-22);                                      //calling method through object and defining value
    }
}
