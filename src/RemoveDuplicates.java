import java.util.ArrayList;
import java.util.List;

//How do you find duplicate numbers in an array if it contains multiple duplicates?
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 4, 1, 1, 4, 4, 3 };
		System.out.println();
		System.out.println(find(a));

	}

	private static List<Integer> find(int[] input) {
		boolean[] b = new boolean[input.length];
		List<Integer> list = new ArrayList<Integer>();
		// loop through input, if current element is false, it means it is never
		// visited
		// and we should do loop to the end to marked all the entries with the
		// same value of
		// current element visited
		for (int i = 0; i < input.length; i++) {
			if (!b[i]) {
				for (int j = i + 1; j < b.length; j++) {
					b[j] = input[i] == input[j] ? true : b[j];
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i]) {
				list.add(input[i]);
			}
		}
		return list;
	}

}
