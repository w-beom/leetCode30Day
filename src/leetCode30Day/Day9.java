package leetCode30Day;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Day9 {
	public static void main(String[] args) {
		String S = "#ab#c";
		String T = "##ad#c";

		System.out.println(backspaceCompare(S, T));

	}

	public static boolean backspaceCompare(String S, String T) {
		Stack<Character> sStk = new Stack<>();
		Stack<Character> tStk = new Stack<>();
		
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '#') {
				if (sStk.size() > 0)
					sStk.pop();
			} else {
				sStk.push(S.charAt(i));
			}
		}
		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) == '#') {
				if (tStk.size() > 0)
					tStk.pop();
			} else {
				tStk.push(T.charAt(i));
			}
		}

		if (sStk.equals(tStk))
			return true;
		else
			return false;
	}
}
