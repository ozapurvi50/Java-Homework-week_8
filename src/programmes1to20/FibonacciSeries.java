package programmes1to20;                                          //package name

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciSeries {                                     //Class name

    public static void main(String[] args) {                       //Main method
        fibonacci();                                               //calling static method into main method
    }
        public static void fibonacci(){                            //Defining static method
        int n = 10, firstTerm = 0, secondTerm = 1;                 // defining variable
        System.out.print("Fibonacci Series till " + n + "  terms ");  //print statement with concatenation value of n
        for(int i = 1; i <= n; ++i){                                // condition applied
            System.out.print (firstTerm + ",");                     //Print statement
            int nextTerm = firstTerm + secondTerm;                  // Integer defined to add first term number and second number
            firstTerm = secondTerm;
            secondTerm= nextTerm;
        }
    }
}
