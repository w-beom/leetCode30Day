package leetCode30Day;

public class Day14 {
	public static void main(String[] args) {
		String s = "abc";
		int[][] shift = { { 0, 1 }, { 1, 2 } };
		System.out.println(stringShift(s, shift));
	}

	public static String stringShift(String s, int[][] shift) {
		char[] sCharArr = s.toCharArray();
		char[] strShift = new char[sCharArr.length];
		for (int i = 0; i < shift.length; i++) {
			int sft = shift[i][1];
			int length = sCharArr.length;
			if (shift[i][0] == 0) {
				for (int j = 0; j < sCharArr.length; j++) {
					int index = (j - sft) % length;
					if (index < 0)
						index += length;
					strShift[index] = sCharArr[j];
				}
			}else {
				for(int j=0;j<sCharArr.length;j++) {
					int index = (j+sft)%length;
					strShift[index]=sCharArr[j];
				}
			}
			
			for(int j=0;j<sCharArr.length;j++) {
				sCharArr[j]=strShift[j];
			}
		}
		return String.valueOf(strShift);
	}

}
