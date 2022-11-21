package Array;

public class Q11RemoveNotPalindromString {

	public static void main(String[] args) {

		String arr[] = { "hello", "I", "from", "dewas", "helleh"};
		for (int i = 0; i < arr.length; i++) {
			String reverseStr = "";
			int strLength = arr[i].length();

			for (int j = (strLength - 1); j >= 0; --j) {
				reverseStr = reverseStr + arr[i].charAt(j);
			}

			if (arr[i].toLowerCase().equals(reverseStr.toLowerCase())) {
				System.out.println(arr[i] + ":- is a Palindrome String.");
			} else {
				System.out.println(arr[i] + " :- is not a Palindrome String.");
			}
		}
	}
}
