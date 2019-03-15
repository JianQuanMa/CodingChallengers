import java.util.Arrays;

//given two arrays of int, find one element from each array so that the sum is equal to the given number(or closet)
//this question is from the CS DOJO's youtube channel, below are my solution and his solution
public class FindSumFromTwoArray {
	public static void main(String[] args) {
		int[] d1 = { 19, 14, 6, 11, -16, 14, -16, -9, 16, 13, 200 };
		int[] d2 = { 13, 9, -15, -2, -18, 16, 17, 2, -11, -7 };
		int goal = -15;

		System.out.print(find(d1, d2, goal));
	}

	// // solution method
	static int find(int[] array1, int[] array2, int goal) {

		Arrays.sort(array1);
		Arrays.sort(array2);
		int x = 0, y = array2.length - 1, bestx = 0, besty = array2.length - 1,
				diff = Math.abs(array1[x] + array2[y] - goal), best = Math.abs(array1[bestx] + array2[besty] - goal);
		while (y >= 0 && x < array1.length) {
			diff = Math.abs(array1[x] + array2[y] - goal);
			best = Math.abs(array1[bestx] + array2[besty] - goal);
			if (diff < best) {
				bestx = x;
				besty = y;
			}
			if (array1[x] + array2[y] - goal == 0) {
				return best;
			} else if (array1[x] + array2[y] - goal > 0) {
				y--;
			} else {
				x++;
			}
		}

		return best;

	}

	// public static void main(String[] args) {
	//
	// int[] d1 = { 19, 14, 6, 11, -16, 14, -16, -9, 16, 13 };
	// int[] d2 = { 13, 9, -15, -2, -18, 16, 17, 2, -11, -7 };
	// int dTarget = -15;
	// // closestSumPair(d1, d2, dTarget) should return {-16, 2}, {-9, -7}
	// for (int i : find(d1, d2, dTarget)) {
	// System.out.print(i + " ");
	// }
	// }

	// a1 and a2 are the given arrays, and target is the target sum.
	// It should return an array of two numbers as the result,
	// one from each array.
	// public static int[] find(int[] a1, int[] a2, int target) {
	// int[] a1Sorted = Arrays.copyOf(a1, a1.length);
	// Arrays.sort(a1Sorted);
	// int[] a2Sorted = Arrays.copyOf(a2, a2.length);
	// Arrays.sort(a2Sorted);
	//
	// int i = 0;
	// int j = a2Sorted.length - 1;
	// int smallestDiff = Math.abs(a1Sorted[0] + a2Sorted[0] - target);
	// int[] closestPair = { a1Sorted[0], a2Sorted[0] };
	//
	// while (i < a1Sorted.length && j >= 0) {
	// int v1 = a1Sorted[i];
	// int v2 = a2Sorted[j];
	// int currentDiff = v1 + v2 - target;
	// if (Math.abs(currentDiff) < smallestDiff) {
	// smallestDiff = Math.abs(currentDiff);
	// closestPair[0] = v1;
	// closestPair[1] = v2;
	// }
	//
	// if (currentDiff == 0) {
	// return closestPair;
	// } else if (currentDiff < 0) {
	// i += 1;
	// } else {
	// j -= 1;
	// }
	// }
	//
	// return closestPair;
	// }

}
