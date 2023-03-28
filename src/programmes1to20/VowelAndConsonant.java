package programmes1to20;                                                   //Package name

import java.util.Scanner;                                            //Import scanner command

/**
 * 3. Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class VowelAndConsonant {                                         //Class name

    public static void main(String[] args) {                           //Main method
        Scanner scan = new Scanner(System.in);                         //Scanner input
        System.out.print("Input a alphabet : ");                      //Print statement for user to enter any alphabet
        String input = scan.nextLine();                               //Storing value or user input to defined variable

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {               // if condition to enter character
            System.out.println("Error: Please enter a single letter from the alphabet.");  //If condition is not true ,error message

        } else {
            char letter = input.charAt(0);                          // vowel input description
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("Input letter is Vowel ");       // If user enters vowel letter, this statement will print
            } else {                                               //Else condition if above condition is not true
                System.out.println("Input letter is Consonant ");  // If above condition is not true , this statement will print
            }

            scan.close();                                         // Close scanner
        }

    }
}
