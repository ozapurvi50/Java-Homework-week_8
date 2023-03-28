package programmes1to20;                                                     //Package name
/**
 * 14. Write a program in Java to display the pattern like a diamond.   While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */

import java.util.Scanner;                                                      //scanner import
public class DiamondPattern {                                                  //class name

    public static void prDiamond(int r, char ch) {                             //static method
        int i = 1;                                                             //value defined to integer
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {                                             //while loop condition
                System.out.print(" ");                                         //print statement
            }
            j = 1;
            while (j++ <= i * 2 - 1) {                                         //while loop condition
                System.out.print(ch);                                          //print statement
            }
            System.out.println();                                              //print statement
            i++;
        }
        i = r - 1;
        while (i > 0){                                                        //while loop condition
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while( j++ <= i * 2 - 1){                                        //while loop condition
                System.out.print(ch);
            }
            System.out.println();                                           //print statement
            i--;
        }
    }
    public static void main(String[] args) {                              //Main Method
        Scanner scan = new Scanner(System.in);                            //Scanner import
        System.out.println("Enter the Number of row : ");                //Print statement
        int a = scan.nextInt();                                          //Defining value to integer from scanner
        System.out.println("Enter the symbol : ");                       //Print statement
        char c = scan.next().charAt(0);                                  //value taken from user and stored in variable
        prDiamond(a,c);                                                  //calling static method with parameters
        scan.close();                                                    //scanner close

    }
}
