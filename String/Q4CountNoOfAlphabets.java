package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4CountNoOfAlphabets {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter first string: ");
		String str1 = sc.nextLine();

		char[] ch = str1.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry mp : map.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
	}
}
