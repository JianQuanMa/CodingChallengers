import java.util.ArrayList;
import java.util.List;

//give  a string, eliminate all chars that are repeated
//time used 8 minutes
public class EliminateDuplicates {
	public static void main(String[] args) {
		String str = " I am from rjt";
		System.out.print(eliminate(str));

	}

	static List eliminate(String str) {
		List<Character> list = new ArrayList();
		for (char c : str.toCharArray()) {
			if (!list.contains(c)) {
				list.add(c);
			}
		}
		return list;
	}

}
