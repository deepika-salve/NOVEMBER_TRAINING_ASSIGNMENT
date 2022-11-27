package Exceptional_Handling.Q5;

import java.util.Date;
import java.util.Scanner;

public class TrainTicketBooking {
	public static void main(String[] args) {
	
		Date d = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dear customer - Please select 1 for normal booking\n" + "2 for Tatkal booking");
		int selection = sc.nextInt();
		// System.out.println(d.getHours()+1);
		try {
			if (selection == 1) {
				@SuppressWarnings("deprecation")
				int time = d.getHours();
				if (time >= 23 && time <= 1) {
					System.out.println("tickets booking not allowed at this time");
					throw new BookingNotAllowedException("BookingNotAllowedException ");
				} else {
					System.out.println("Enter age of passenger");
				}
				int inputage = sc.nextInt();
				if (inputage > 5) {
					System.out.println("enter number of bookings");
					int number = sc.nextInt();
					if (number > 0 && number <= 6) {
						System.out.println(number + " booking are done");
					} else {
						System.out.println("only 6 are allowed");
						throw new NormalTicketBookingException("normalTicketBookingException");
					}
				} else {
					System.out.println("age exception");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			if (selection == 2) {
				if (d.getHours() >= 10 && d.getHours() <= 12) {
					System.out.println("Enter age of passenger");
					int inputage = sc.nextInt();
					if (inputage > 5) {
						System.out.println("enter number of bookings");
						int number = sc.nextInt();
						if (number > 0 && number <= 4) {
							System.out.println(number + " booking are done");
						} else {
							System.out.println("only 4 are allowed");
							throw new Exception("booking limit exceed");
						}
					} else {
						System.out.println("age exception");
					}
				} else {
					System.out.println("No tatkal tickets are allowed at this time");
					throw new Exception("TatkalTicketBookingException");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	

	}

}
