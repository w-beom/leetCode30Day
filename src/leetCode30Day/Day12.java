package leetCode30Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day12 {
	public static void main(String[] args) {
		int[] stones = { 1, 3 };

		System.out.println(lastStoneWeight(stones));
	}

	public static int lastStoneWeight(int[] stones) {
		ArrayList<Integer> stoneList = new ArrayList<Integer>();
		for (int stone : stones)
			stoneList.add(stone);
		while (stoneList.size() > 1) {
			Collections.sort(stoneList);
			int a = (stoneList.get(stoneList.size() - 1)) - (stoneList.get(stoneList.size() - 2));
			stoneList.remove(stoneList.size() - 1);
			stoneList.remove(stoneList.size() - 1);
			if (a > 0) {
				stoneList.add(a);
			}

		}
		if (stoneList.size() == 0) {
			return 0;
		}
		return stoneList.get(0);
	}

}
