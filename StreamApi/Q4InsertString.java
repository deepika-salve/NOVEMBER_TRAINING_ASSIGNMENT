package StreamApi;

import java.util.Scanner;

interface FuncInterfaceForInsertString {

	String abstractFun2(String s1, String s2);

}

public class Q4InsertString {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		Scanner demo = new Scanner(System.in);

		System.out.print("Please enter first string: ");
		String str1 = demo.nextLine();

		System.out.print("Please enter second string: ");
		String str2 = demo.nextLine();

		System.out.print("Please enter Index : ");
		int index = demo.nextInt();

		String result = new String();

		FuncInterfaceForInsertString fobj1 = (String x, String s2x) -> {
			String r = new String();
			for (int i = 0; i < x.length(); i++) {
				r = r + x.charAt(i);
				if (i == index) {
					r = r + s2x;
				}
			}
			return r;

		};

		System.out.println("The new string is :" + fobj1.abstractFun2(str1, str2));
		System.gc();
	}

}
