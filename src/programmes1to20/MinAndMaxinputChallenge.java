package programmes1to20;                                  //Package name

import java.util.Scanner;                                 // importing scanner

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxinputChallenge {                    //Class name

    public static void main(String[] args) {              //Main method
        Scanner scan = new Scanner(System.in);            //importing scanner

        int min = Integer.MAX_VALUE;                     //defining Maximum value to variable
        int max = Integer.MIN_VALUE;                     //defining Minimum value to variable

        while(true) {                                    //created endless loop
            System.out.println("Enter the number : ");   //Asking user to enter number unless the user enters character or symbol
            if(scan.hasNextInt()){
                int number = scan.nextInt();
                min = Math.min(min,number);              //Prints minimum number of all , entered by user
                max = Math.max(max,number);              //Prints maximum number of all , entered by user
            } else {
                System.out.println("Invalid input");     //When user enters character or symbol loop ends
                break;                                   //break from loop, when enter character or symbol
            }
        }

        System.out.println("Minimum number : " + min);  // Print statement with minimum value , entered by user
        System.out.println("Minimum number : " + max);  // Print statement with maximum value , entered by user
        scan.close();                                   //closing scanner

    }
}
