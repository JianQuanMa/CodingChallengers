// given a string of chars, find the first longest word that only contains English alphabet 
//time used 10 minutes
public class LongestWordFinder {

	public static void main(String[] args) {
		String str = "ML. It is an and 32523542352435432 easily parse-able i";
		System.out.println(find(str));

	}

	private static int find(String str) {
		int max = 0, current = 0;
		for (int i = 0; i < str.length(); i++) {
			while (i < str.length() && isLetter(str.charAt(i))) {
				current++;
				i++;
			}
			max = current > max ? current : max;
			current = 0;
		}
		return max;

	}

	// return true if it is a capital or small letter
	static boolean isLetter(char c) {

		return (c - 'a' >= 0 && 'z' - c <= 25) || (c - 'A' >= 0 && 'Z' - c <= 25);
	}
}
