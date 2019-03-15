import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//given a array of int, where -1 represents a tree and positive numbers represent people of that age
//now sort people (trees stay in place) in ascending order
// time used 13 minutes
public class SortingPeopleInTheBar {
	public static void main(String[] args) {
		/*
		 * 1. create a list with only people 2.sort them in asd order 3.put them
		 * in input array
		 */
		// input array of int
		int[] array = { -1, 34, -1, 20, -1, -1, 64, 7, 4 };
		List<Integer> sortableList = new ArrayList<>();

		for (int i : array) {
			if (i != -1) {
				sortableList.add(i);
			}
		}
		Collections.sort(sortableList);

		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				array[i] = sortableList.get(index);
				index++;

			}

		}

	}

}
