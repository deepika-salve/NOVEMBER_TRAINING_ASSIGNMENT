package TDD.Q4;

public class StringAddition {
	public String additionString(String string) {
		int sum=0;
		int add=0;
		for(int i=0;i<string.length();i++) {
			sum=sum+string.charAt(i);
			i++;
		}
		System.out.println(sum);
		while(sum>0) {
			int rem=sum%10;
			add=add+rem;
			sum=sum/10;
		}
		String string2 = Integer.toString(add);
		System.out.println(string2);
		return string2;
	}
}
