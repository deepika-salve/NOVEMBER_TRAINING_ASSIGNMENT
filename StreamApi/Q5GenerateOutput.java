package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Q5GenerateOutput {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,7,8,11,13,14,15,19,20,21};
		List<List<Integer>> ListMain = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(a[0]);

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] == a[i] + 1) {
                temp.add(a[i + 1]);
            } else {
                ListMain.add(temp);
                temp = new ArrayList<>();
                temp.add(a[i+1]);
            }
        }

        ListMain.add(temp);

        System.out.println(ListMain);
    }

	}

