package leetCode30Day;

import java.util.HashMap;
import java.util.Iterator;

public class Day7 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 5, 5, 7, 7 };
		System.out.println(countElements(arr));
	}

	public static int countElements(int[] arr) {
		HashMap<Integer, Integer> eleMap = new HashMap<>();
		int count = 0;
		for (int num : arr) {
			eleMap.put(num, eleMap.getOrDefault(num, 0) + 1);
		}

		Iterator<Integer> keys = eleMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			if (eleMap.containsKey(key + 1)) {
				count+=eleMap.get(key);
			}
		}

		return count;

	}
	
	
	

}
