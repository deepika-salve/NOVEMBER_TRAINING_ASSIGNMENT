package StreamApi;

public class Q2FindSequence {

	static boolean isSubSequence(String str1, String str2, int m, int n) {
	    int i = 0, j = 0;
	    while (i < n && j < m) {
	        if (str1.charAt(i) == str2.charAt(j))
	            i++;
	        j++;
	    }
	    return i == n;
	}

	public static void main(String[] args) {
		String str1 = "AST";
		String str2 = "Taj is situated in Agra.";
		int m = str1.length();
		int n = str2.length();
		boolean res = isSubSequence(str1, str2, m, n);
		if (res)
			System.out.println("string found");
		else
			System.out.println("string not found");
	}
}
