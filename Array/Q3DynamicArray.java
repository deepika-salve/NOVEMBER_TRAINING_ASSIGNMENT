package Array;

public class Q3DynamicArray {

	private int array[];
	private int count;
	private int sizeofarray;

	public Q3DynamicArray() {
		array = new int[1];
		count = 0;
		sizeofarray = 1;
	}

	public void addElement(int a) {
		if (count == sizeofarray) {
			growSize();
		}
		array[count] = a;
		count++;
	}

	public void growSize() {
		int temp[] = null;
		if (count == sizeofarray) {
			temp = new int[sizeofarray * 2];
			{
				for (int i = 0; i < sizeofarray; i++) {
					temp[i] = array[i];
				}
			}
		}
		array = temp;
		sizeofarray = sizeofarray * 2;
	}


	public static void main(String[] args) {
		Q3DynamicArray da = new Q3DynamicArray();
		da.addElement(2);
		da.addElement(92);
		da.addElement(75);
		da.addElement(57);
		da.addElement(35);
		
		System.out.println("Elements of the array:");
		for (int i = 0; i < da.sizeofarray; i++) {
			System.out.print(da.array[i] + " ");
		}
		System.out.println();
		System.out.println("Size of the array: " + da.sizeofarray);
		System.out.println("No. of elements in the array: " + da.count);
	}

}
