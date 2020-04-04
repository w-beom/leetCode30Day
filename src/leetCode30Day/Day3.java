package leetCode30Day;

public class Day3 {

	public static void main(String[] args) {
		int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray2(num));
	}
	
	//처음 접근했던 방식
	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int sum;
		for (int i = 0; i < nums.length; i++) {
			sum = nums[i];
			for (int j = i; j < nums.length; j++) {
				if (maxSum < sum) {
					maxSum = sum;
				}
				if (j < nums.length - 1)
					sum += nums[j + 1];
			}
		}
		return maxSum;
	}
	
	//카데인 알고리즘으로 푼 답
	public static int maxSubArray2(int[] nums) {
		int maxSum = 0;
		int endMax = Integer.MIN_VALUE;
		for (int i = -1; i < nums.length - 1; i++) {
			maxSum = Math.max(maxSum + nums[i + 1], nums[i + 1]);
			endMax = Math.max(maxSum, endMax);
		}

		return endMax;
	}

}
