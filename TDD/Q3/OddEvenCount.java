package TDD.Q3;

public class OddEvenCount {

	public int evenCount(long no) {
		int even=0;
		while(no>0) {
			long rem=no%10;
			if(rem%2==0) {
				even++;
			}
			no=no/10;
		}
		return even;
		
	}
	
	public int oddCount(long no) {
		int odd=0;
		while(no>0) {
			long rem=no%10;
			if(rem%2!=0) {
				odd++;
			}
			no=no/10;
		}
		return odd;
		
	}
}
