package kat.reversestring;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kathleentan
 */

public class ReverseString {

    public static void main(String[] args) throws FileNotFoundException  {
        
        // Creating a scanner to get the number of jokes (lines to read) from the user.
        Scanner scnr = new Scanner(System.in);
        int numJokes;
        System.out.println("How many jokes are written?");
        numJokes = scnr.nextInt();
        
        for (int i = 0; i < numJokes; i++) {
            
            // Reads however many number of lines the user dictates.
            String line = Utilities.readLine("Jokes.txt", i);
            System.out.println(line);
            
            // Creates a String array of the words of one sentence separarted by the spaces.
            String[] word = line.split(" ");
            
            // Calls the method that consequently reverses each word of the sentence.
            Utilities.stringToCharacters(word);
            
            // Prints out the final sentence. Commas and periods are not kept in the same order as in the original sentences, they are reversed as characters.
            System.out.print("The joke reversed: ");
            for (String reversedWord : word) {
                System.out.print(reversedWord + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
