package leetCode30Day;

import java.util.ArrayList;
import java.util.List;

public class Day9 {
	public static void main(String[] args) {
		String S = "ab#c";
		String T = "ad#c";

		System.out.println(backspaceCompare(S, T));

	}

	public static boolean backspaceCompare(String S, String T) {
		char[] sStr = S.toCharArray();
		char[] tStr = T.toCharArray();
		List<Character> a = new ArrayList<Character>();
		List<Character> b = new ArrayList<Character>();

		for (int i = 0; i < S.length(); i++) {

			if (sStr[i] == '#' && i > 0) {
				a.remove(a.size() - 1);
			} else
				a.add(sStr[i]);
			
			if (tStr[i] == '#' && i > 0) {
				b.remove(b.size() - 1);
			} else
				b.add(tStr[i]);
		}
		if (a.equals(b))
			return true;
		else
			return false;
	}
}
