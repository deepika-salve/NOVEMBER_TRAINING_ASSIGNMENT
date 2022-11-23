package Q7;

public class Q7Test {

	public int stringCompare(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int lenMin = Math.min(len1, len2);

		// comparing each string alphabet wise
		for (int i = 0; i < lenMin; i++) {
			int str1_ch = (int) str1.charAt(i);
			int str2_ch = (int) str2.charAt(i);

			if (str1_ch != str2_ch) {
				return str1_ch - str2_ch;
			}
		}
		if (len1 != len2) {
			return len1 - len2;
		} else {
			return 0;
		}
	}

}
