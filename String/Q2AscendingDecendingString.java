package String;

import java.util.Scanner;

public class Q2AscendingDecendingString {

	public static char[] ascending(String str) {
		int j = 0;
		char temp = 0;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (j = i+1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}

		return chars;

	}

	public static char[] descending(String str) {
		int j = 0;
		char temp = 0;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (j = i+1; j < chars.length; j++) {
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}

		return chars;

	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		char[] chars = ascending(str);
		System.out.println("The string in ascending order : ");
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}

		System.out.println();
		char[] chars2 = descending(str);
		System.out.println("The string in descending order : ");
		for (int i = 0; i < chars2.length; i++) {
			System.out.print(chars2[i]);
		}
	}
}
