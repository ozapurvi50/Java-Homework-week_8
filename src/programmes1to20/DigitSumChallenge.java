package programmes1to20;                        //Package name

import java.util.Scanner;

/**
 * . Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,  otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process  negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.  Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working  correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 *  Use n = n / 10 to discard the least-significant digit.
 *  The method needs to be static
 *  Create a class with the name DigitSumChallenge.
 */
public class DigitSumChallenge {               //Class name

    public static int sumDigits(int number){  //Write a method with the name sumDigits that has one int parameter called number.
        if( number < 10){       //If the parameter is >= 10 then the method should process the number and return sum of all digits,
            return -1;         //otherwise return -1 to indicate an invalid value.
        }

        int sum = 0;

        while (number > 0){                //The numbers from 0-9 have 1 digit so we don't want to process them;
            int digit = number % 10;    //Use n % 10 to extract the least-significant digit.
            sum += digit;
            number /= 10;               //Use n = n / 10 to discard the least-significant digit.
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(8888));

    }

    public static class ReadingUserInputChallenge {                         //Create a class with the name ReadingUserInputChallenge.

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);                   //import scanner
            int count = 1;                                           //define integer value
            int sum = 0;                                             //define integer value

            while (count <= 10) {                                    //while loop
                System.out.print("Enter number #" + count + ":");    //the first message printed to the user would be Enter number #1:
                if (scan.hasNextInt()) {                             //Use a while loop. //Use the hasNextInt() method from the scanner to check if the user has entered an int value.
                    int number = scan.nextInt();                     //user input in console
                    sum += number;
                    count++;                                       //Use a counter variable for counting valid numbers.
                } else {
                    System.out.println("Invalid Number");          // print statement if user enters character or symbol insteat of number
                    scan.next();                                   //user enters next number
                }
            }

            System.out.println("The sum of the 10 number is: " + sum);  // print statement with sum value of 10 numbers
            scan.close();                                          //Close the scanner after you don't need it anymore.
        }
    }

    public static class MinAndMaxInputChallenge {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int min = Integer.MAX_VALUE;
            int max = Integer.MAX_VALUE;

            while(true){
                System.out.println("Enter number : ");

                if(scan.hasNextInt()){
                    int number = scan.nextInt();
                    min = Math.min(min, number);
                    max = Math.max(max,number);
                } else {
                    break;
                }
        }

            System.out.println("Minimum number entered is :" + min);
            System.out.println("Maximum number entered is :" + max);
            scan.close();
        }
    }
}
