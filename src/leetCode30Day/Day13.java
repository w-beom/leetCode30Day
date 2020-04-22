package leetCode30Day;

import java.util.Stack;

public class Day13 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0 };
		System.out.println(findMaxLength(nums));
	}

	public static int findMaxLength(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		if (nums.length < 1) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (stack.empty())
				stack.push(nums[i]);
			else if (stack.lastElement() != nums[i]) {
				stack.push(nums[i]);
				max = Math.max(max, stack.size());
			} else
				stack.removeAllElements();
		}
		if (max % 2 == 0)
			return max;
		else
			return max-1;

	}

}
