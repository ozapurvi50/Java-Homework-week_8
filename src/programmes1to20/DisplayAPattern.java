package programmes1to20;                                        // Package name

import java.util.Scanner;                                       //Importing scanner

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg. Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class DisplayAPattern {                                        //Class name

    public static void main(String[] args) {                          //Main method
        int i, x, n;
        System.out.println("Input number of rows : ");
        Scanner scan = new Scanner(System.in);                        //Scanner import
        n = scan.nextInt();

        for (i = 1; i <= n; i++) {                                   //Condition applied
            for (x = 1; x <= i; x++)
                System.out.print(x);                                //Print statement
            System.out.println(" ");
            scan.close();                                          //Closing statement
        }
    }
}


