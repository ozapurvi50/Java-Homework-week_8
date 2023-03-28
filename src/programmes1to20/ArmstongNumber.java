package programmes1to20;                                         // Package name
/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;                                          //importing scanner

public class ArmstongNumber {                                      //Class name

    public static void isArmstrongNumber(int num) {                //Defining Static method
        int number, temps, tot = 0;                                //Defining integer
        number = num;
        while (num != 0) {                                         //While loop condition applied
            temps = num % 10;
            tot = tot + temps * temps * temps;
            num /= 10;
        }
        if (tot == number) {                                        //Condition applied
            System.out.print(number + " is a Armstrong number");    //if the condition is true, print statement
        } else {                                                     // if the first condition is no true else condition will be applied
            System.out.print(number + " is not a Armstrong number"); // if the above condition is not true print this statement
        }
    }
    public static void main(String[] args) {                          // Main method
        Scanner scan = new Scanner(System.in);                        //Importing scanner
        System.out.println("Enter any number : ");                    //Print statement for user to enter number
        int a = scan.nextInt();                                       //variable define for user input
        isArmstrongNumber(a);                                         //calling static method
        scan.close();                                                 //closing scanner
    }
}