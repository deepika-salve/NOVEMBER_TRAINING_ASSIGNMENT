package Array;

import java.util.Scanner;

public class Q9PrintBoundaryEleOfMatrix {

	public static void main(String[] args) {
      int row, col;
        
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = scanner.nextInt();
        
       
        System.out.println("Enter total number of columns : ");
        col = scanner.nextInt();
        
        
		int inputArray[][] = new int[row][col];
		
		 for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
	                inputArray[i][j] = scanner.nextInt();
	            }
	        }
	        
	        //6
	        System.out.println("You have entered : ");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(inputArray[i][j] + "\t");
	            }
	            System.out.println();
	        }
		System.out.println("The boundary elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print(inputArray[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
	}

}
