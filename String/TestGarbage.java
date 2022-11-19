package String;

public class TestGarbage {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		String s1 = "java";
		TestGarbage s2 = new TestGarbage();
		s1 = null;
		s2 = null;
		System.gc();
	}

}
