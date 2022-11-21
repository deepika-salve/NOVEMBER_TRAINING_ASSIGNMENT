package Array;

import java.util.Arrays;

public class Q8SaparateVowelAndConsonants {

		 public static void main(String[] args) {
		        char[] a={'h','e','b','a','e','w'};
		        System.out.println(Arrays.toString(arrangeVowelConsonant(a)));
		    }

		   static char[] arrangeVowelConsonant(char[] a){
		        char[] result = new char[a.length];
		        int count=0, len=a.length-1;
		        String s = "aeiouAEIOU";
		        char[] ch=s.toCharArray();
		        for(int i=0;i<a.length;i++){
		            int flag=0;
		            for(int j=0;j<a.length;j++){
		                if(a[i]==ch[j]){
		                    result[count] = a[i];
		                    count++;
		                    flag++;
		                    continue;
		                }
		            }
		            if(flag==0){
		                result[len]=a[i];
		                len--;
		            }
		        }
		        return result;
		    }
}
