package Practice;

public class Error {

	public static void main(String args[]) {
		// method calling
		recursiveDemo(10);
	}

	public static void recursiveDemo(int i) {
		while (i != 0) {
			// increments the variable i by 1
			i = i + 1;
			// recursive called method
			recursiveDemo(i);
		}
	}
}
