package String;

import java.util.Scanner;

public class StringProgram1 {
	
	public static void main(String args[]){
		
		  
		  Scanner demo = new Scanner(System.in);
		  
		  System.out.print("Please enter first string: "); 
		  String str1= demo.nextLine();
		  
		  System.out.print("Please enter second string: ");
		  String str2= demo.nextLine();
		  
		  System.out.print("Please enter Index : ");
		  int index= demo.nextInt();
		  
		  String result= new String();
		 
		  for(int i=0; i<str1.length();i++) {
			  result = result+ str1.charAt(i);
			  if(i==index) {
				  result= result + str2;
			  }
		  }
		  
		  System.out.println("The new string is :"+ result); 
		  }
		 
}
