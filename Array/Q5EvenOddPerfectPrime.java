package Array;

public class Q5EvenOddPerfectPrime {

	static void CountingEvenOdd(int arr[], int arr_size) {
		int even_count = 0;
		int odd_count = 0;
		for (int i = 0; i < arr_size; i++) {

			// checking if a number is
			// completely divisible by 2
			if ((arr[i] % 2 == 0))
				even_count++;
			else
				odd_count++;

		}

		System.out.println("Number of even" + " elements = " + even_count + " Number of odd elements = " + odd_count);
	}

	static void PerfectNumber(int arr[], int arr_size) {
		for (int j = 0; j < arr_size; j++) {

			{
				long sum = 0;
				for (int i = 1; i <= arr[j] / 2; i++) {
					if (arr[j] % i == 0) {
						sum = sum + i;
					} 
				} 

				if (sum == arr[j])
					System.out.println(arr[j] + " is a perfect number");
				else
					System.out.println(arr[j] + " is not a perfect number");
			}
		}
	}

	static void checkPrime(int arr[], int arr_size) {

		for (int j = 0; j < arr_size; j++) {
			int i, m = 0, flag = 0;
			m = arr[j] / 2;
			if (arr[j] == 0 || arr[j] == 1) {
				System.out.println(arr[j] + " is not prime number");
			} else {
				for (i = 2; i <= m; i++) {
					if (arr[j] % i == 0) {
						System.out.println(arr[j] + " is not prime number");
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.println(arr[j] + " is prime number");
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 496, 5, 6, 17 };
		int n = arr.length;

		// Function Call
		CountingEvenOdd(arr, n);
		PerfectNumber(arr, n);
		checkPrime(arr, n);
	}

}
