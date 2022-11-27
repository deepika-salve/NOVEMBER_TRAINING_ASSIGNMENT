package Exceptional_Handling.Q5;

public class BookingNotAllowedException extends Exception {
	public BookingNotAllowedException(String message) {
		super(message);
	}
}
