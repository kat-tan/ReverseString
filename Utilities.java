package kat.reversestring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author kathleentan
 */

public class Utilities {
    
    // Takes the existing text file's directory to read each line. The read line is returned to the call from the main method.
    
    public static String readLine(String fileName, int lineNumber) throws FileNotFoundException {
        String Directory = "/Users/kathleentan/NetBeansProjects/reverseString/src/main/resources/";
       
        try{
        
        // Makes it so that the files name may be changed but still in the same directory location. 
        // This is not ideal since the directory is specific to my computer.
        File file = new File(Directory + fileName);
        
        // Giving the ability to scan the text.
        Scanner scnr = new Scanner(file); 
        int lineCounter = 0;
        String line;
        
        while(scnr.hasNextLine()) {
            line = scnr.nextLine();
           
            if (lineCounter == lineNumber) {
                return line;
            }
            lineCounter++;
        }
        
        return "";
        }
        
        catch(FileNotFoundException ex) {
            return "";
        }
    }
    
    // Uses the String array that was created from reading one line, coverts it to character array to be reversed in reverseWord method.
    
    public static void stringToCharacters(String[] words) {
        for (int i = 0; i < words.length; i++) {
            
            // Creates a character array from each element in the String array.
            char[] wordChars = words[i].toCharArray();
            
            // Takes the character array, from one word, and reversed the order of the letters.
            reverseWord(wordChars);
            
            // Used the reversed string to store into original string array to be used in main.
            words[i] = new String(wordChars);
         
        }
    }

    // Used code from https://www.techiedelight.com/reverse-string-without-using-recursion/ to reverse using a stack for each word.
    
    public static void reverseWord(char[] input) {
        
        Stack<Character> stack = new Stack<>();
        
        // Knowing the length of each word, the characters are pushed on the stack.
        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
            
            
        }
        
        //
        int index = 0;
        while (!stack.empty()) {
            // The character at the top of the stack is removed and returned to the original stack.
            char top = stack.pop();
            input[index++] = top;
        
        }
    }
}
