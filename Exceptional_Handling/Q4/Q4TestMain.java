package Exceptional_Handling.Q4;

import java.util.Scanner;

public class Q4TestMain {
	static Scanner scanner = new Scanner(System.in);
    static String itemName;
    static String purchaseditemName;
    static double price;
    static int qtyToPurchase;
   public static void addItems() {
       for (int i = 0; i < 3; i++) {
           System.out.println("Enter the name the Item");
           itemName = scanner.next();
           System.out.println("Enter the price of the Item");
           double price = scanner.nextFloat();
           System.out.println("Enter the name Avaialble Qty");
           int maximumNumberOfItem = scanner.nextInt();
       }
    }
   public static void purchaseItems() throws Exception {
       System.out.println("How many items you want to purchase");
        int number = scanner.nextInt();
        double bill = 0;
        double temp = 0;
        for (int i = 0; i < number; i++) {
           temp = bill;
           System.out.println("Enter the Item name");
           String purchaseditemName = scanner.next();
           System.out.println("Enter Quantity to purchase");
           int qtyToPurchase = scanner.nextInt();
           if (qtyToPurchase > 2) {
               throw new ItemPurchaseLimitExceed("Maximum Number of item Limit Exceed");
            }
           System.out.println("Enter price of item");
           double price = scanner.nextFloat();
           if (price == 0) {
               throw new Exception("Price input invalid");
            }
           bill = (price * qtyToPurchase) + temp;
       }
        System.out.println("The bill of the purchased Items" + bill);
   }
   
   public static void main(String[] args) throws Exception {
		
		addItems();
       purchaseItems();
	}

}
