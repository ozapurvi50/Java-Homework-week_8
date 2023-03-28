package programmes1to20;                                          // package name

/**
 * Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class LeftAngleTriangle {                                  //Class name

    public static void main(String[] args) {                     //Main method
      triangle();                                                //calling method
    }


    public static void triangle(){                               //Static method
        int rows = 6;                                           //defining integer
        for(int x = 1; x <= rows; x++)                         //condition applied
        {
            for (int i = 1; i<= x; i++)
            {
                System.out.print("* ");                       //Print statement
            }
            System.out.println("");                           //Print statement
        }

    }

}
