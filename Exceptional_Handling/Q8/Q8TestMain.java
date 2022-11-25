package Exceptional_Handling.Q8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q8TestMain {
	
	public static void printStrongNess(String input) throws PasswordFormatException
    {
        int n = input.length();
        int hasLower = 0, hasUpper = 0,
                hasDigit = 0, specialChar = 0;
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&','*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower++;
            if (Character.isUpperCase(i))
                hasUpper++;
            if (Character.isDigit(i))
                hasDigit++;
            if (set.contains(i))
                specialChar++;
        }
       
        // Strength of password
        System.out.print("Strength of password:- ");
        if (hasDigit>=2 && hasLower>=2 && hasUpper>=2 && specialChar >=2
            && (n >= 8))
            System.out.print(" Strong");
        else 
         throw new PasswordFormatException("Password Should be Strong:  having at least 2 capital letters, 2 small letters, 2 digits and 2 special characters and minimum \r\n"
         		+ "requirements for password of length 8 for password of length greater than 8");
    }
 
    public static void main(String[] args) throws PasswordFormatException
    {
        String input = "Deepikasalve14@Salve";
        printStrongNess(input);
    }
 
     
}


