package leetCode30Day;

public class Day3 {

	public static void main(String[] args) {
		int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(num));
	}

	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int sum;
		for (int i = 0; i < nums.length; i++) {
			sum = nums[i];
			for (int j = i; j < nums.length; j++) {
				if (maxSum < sum) {
					maxSum = sum;
				}
				if (j < nums.length-1)
					sum += nums[j + 1];
			}
		}
		return maxSum;
	}

}
