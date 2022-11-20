package String;

import java.util.GregorianCalendar;

public class Q5StringBufferAndStringBuilder {
	
	public static void stringBufferPer() {
		
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 10000000; i++) {
			sb.append(":").append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken by String Buffer:" + (end - start));
		System.out.println("Memory used:" + (startMemory - endMemory));
	}
	
public static void stringBuilderPer() {
		
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000000; i++) {
			sb.append(":").append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken by String Builder:" + (end - start));
		System.out.println("Memory used:" + (startMemory - endMemory));
	}

	public static void main(String[] args) {
		stringBufferPer();
		stringBuilderPer();
	}
}
