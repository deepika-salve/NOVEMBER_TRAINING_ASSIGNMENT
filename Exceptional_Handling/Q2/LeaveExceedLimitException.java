package Exceptional_Handling.Q2;

public class LeaveExceedLimitException extends Exception {
	
	public LeaveExceedLimitException(String errorMessage) {
		super(errorMessage);
}
}