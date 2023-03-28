package programmes1to20;                                                                //Package name

import java.util.Scanner;                                                               //Scanner import command

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words,  prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13,  17....
 * are the prime numbers.)
 */
public class PrimeNumbers {                                                             //Class name

    public static void isPrimeNumber(int num) {                                          //Static method
        boolean Prime = false;                                                           //integer boolean used for true or false
        for (int i = 2; i <= num / 2; ++i) {                                             //for condition applied
            if (num % i == 0) {
                Prime = true;
                break;                                                                   //if the condition is true, break the loop
            }
        }
        if (!Prime)                                                                     // if condition is applied
            System.out.println(num + " is a prime number.");                            //print statement if the number is prime number
        else                                                                            // if , the above condition is not true , else condition applied
            System.out.println(num + " is not a prime number.");                        //print statement if the number is not prime
    }

    public static void main(String[] args) {                                           //Main method

        Scanner scan = new Scanner(System.in);                                         //importing scanner

        System.out.print("Enter any number: ");                                        //print statement for user to input number in console

        int a = scan.nextInt();                                                        // integer defined to input value from scanner
        isPrimeNumber(a);                                                              //calling static method including parameters

        scan.close();                                                                  //Scanner close

    }


}
