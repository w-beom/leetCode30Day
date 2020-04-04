package leetCode30Day;

public class Day4 {
	public static void main(String[] args) {
		int[] nums = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
		solution(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

}
