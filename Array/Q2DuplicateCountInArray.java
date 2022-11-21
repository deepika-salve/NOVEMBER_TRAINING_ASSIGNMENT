package Array;

public class Q2DuplicateCountInArray {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3, 2 };
		int duplicateCounter = 0;

		System.out.print("Duplicates: ");

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			int numOfOccurrences = 1;

			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					numOfOccurrences++;
					duplicate = true;
				}
			}
			if (numOfOccurrences == 2 && duplicate == true) {
				duplicateCounter++;
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println("count:" + duplicateCounter);
	}

}
