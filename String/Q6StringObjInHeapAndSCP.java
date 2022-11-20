package String;

public class Q6StringObjInHeapAndSCP {

	public static void main(String args[]) {

		// allocated in SCP area
		String str1 = "abc";
		String str2 = "abc";

		if (str1 == str2)
			System.out.println("Yes");
		else
			System.out.println("No");

		// allocated in Heap area
		String s1 = new String("abc");
		String s2 = new String("abc");

		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
