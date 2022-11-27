package Exceptional_Handling.Q10;

import java.util.Scanner;

public class Q10TestMain {
	
	public static void main(String[] args) {
        int arr1[] = {1, 3, 2, 6, 4, 9};
        Q10Parent a = new Q10Parent();
       
        Q10Child c1 = new Q10Child();
        System.out.println("Type 1 for Find maximum in array");
        System.out.println("Type 2 for Find average and maximum of the array ");
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        switch(input) {
        case 1 :
            a.CalculateMaxFromArray(arr1);
            break;
        case 2 :
            c1.CalculateMaxFromArray(arr1);
            break;
        }
    }

}
