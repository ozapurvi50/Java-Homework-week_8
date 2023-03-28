package programmes1to20;                                           //package name

import java.util.Scanner;                                         //importing scanner command

/**
 * . Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Triangle {                                                   //class method
    public static void triangle(int n) {                                  //static method
        for (int r = 0; r <= n; r++){                                     // for condition
          for (int a = 0; a < r; a++) {                                   // for condition
                System.out.print("@");                                     //print statement
            }
            System.out.println("");                                        //print statement
        }
        }
        public static void main (String [] args){                         //Main method
            Scanner scan = new Scanner(System.in);                        //Scanner import
            System.out.println("Input number of rows : ");                //print statement
            triangle(scan.nextInt());                                     //user input stored in method
            scan.close();                                                 //Scanner close
        }
    }
