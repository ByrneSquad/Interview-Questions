
package siemensquestion;

import java.util.Scanner;



public class SiemensQuestion {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a string.");
        String input = kb.next();
        
        char[] userInput = input.toCharArray();
        
        for(int i = userInput.length - 1; i >= 0; i--) {
        System.out.print(userInput[i]);
        
        
    }
        System.out.println("");
}
}