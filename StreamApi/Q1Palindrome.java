package StreamApi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q1Palindrome {
	static boolean checkPalindrome(int num)
	{
	     
		String temp = Integer.toString(num);
        boolean val = IntStream.range(0,temp.length()/2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length()-i-1));
        return val;
	}
	 
	public static void main(String[] args)
	{
	     System.out.println("Enter the number");
	    Scanner sc= new Scanner(System.in);
	    int st = sc.nextInt();
	     
	    if (checkPalindrome(st) == true)
	        System.out.print("Number is palindrome");
	    else
	        System.out.print("Number is not palindrome");
	}
	

}
