//How do you find the largest and smallest number in an unsorted integer array?
// time used 3 minutes
public class FindTheSmallestAndLargestNumber {

	public static void main(String[] args) {
		int[] array = { 12, 34, 2, 56, 0, -3, 5, 12, 23 };

		int max = array[0];
		int min = array[0];

		for (int i : array) {
			max = i > max ? i : max;
			min = i < min ? i : min;
		}

		System.out.println(max + " " + min);
	}

}
