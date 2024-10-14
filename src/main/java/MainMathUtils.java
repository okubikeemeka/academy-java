
public class MainMathUtils {
	public class MathUtils {
		public static int add(int a, int b) {
			int result = a + b;
			return result;

		}
	}

	public static void main(String[] args) {
		int result = MathUtils.add(5, 3);
		System.out.println("The sum is: " + result);
	}
}
