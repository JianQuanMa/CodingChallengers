//1:17
public class ArrayReverser {

	public static void main(String[] args) {
		String[] objectArray = { "1", "2", "r", "8", "9" };
		reverse(objectArray);
		for (String str : objectArray) {
			System.out.print(str + " ");
		}

	}

	private static void reverse(Object[] input) {
		for (int i = 0; i < input.length / 2; i++) {
			swap(input, i, input.length - i - 1);
		}

	}

	private static void swap(Object[] input, int i, int j) {
		Object temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}

}
