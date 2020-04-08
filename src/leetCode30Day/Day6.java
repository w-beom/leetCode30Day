package leetCode30Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day6 {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> lists = groupAnagrams(strs);

		for (List<String> list : lists) {
			for (String str : list) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List> hashStr = new HashMap<String,List>();
		for (String str : strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String key = String.valueOf(arr);
			if (!hashStr.containsKey(key)) {
				hashStr.put(key, new ArrayList());
			}
			hashStr.get(key).add(str);
		}

		return new ArrayList(hashStr.values());	

	}

}
