package String;

public class Q7TestGarbage {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		String s1 = "java";
		Q7TestGarbage s2 = new Q7TestGarbage();
		s1 = null;
		s2 = null;
		System.gc();
	}

}
