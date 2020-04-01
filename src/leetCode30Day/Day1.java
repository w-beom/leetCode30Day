
/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

package leetCode30Day;

import java.util.Arrays;

public class Day1 {

	public static void main(String[] args) {

		int[] nums = { 16, 12, 5, -6, 12, 4, 17, -5, 2, -3, 2, 4, 5, 16, -3, -4, 15, 15, -4, -5, -6 };

		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {

		Arrays.sort(nums);
		int a = nums[0];
		
		//nums의 길이가 1이면 a가 정답이니 바로 return
		if (nums.length == 1) {
			return a;
		}
		
		//정렬된 nums의 nums[0]!=num[1]이면 nums[0] return
		if (a != nums[1])
			return a;
		
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1])
				return nums[i];
		}
		
		//위의 for문에서 만족하지 않으면 nums의 마지막 배열 값이 정답이므로 return
		return nums[nums.length - 1];

	}

}
