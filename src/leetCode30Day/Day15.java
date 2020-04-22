package leetCode30Day;

public class Day15 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(nums);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	/*
	 * public static int[] productExceptSelf(int[] nums) { int[] result= new
	 * int[nums.length]; for(int i=0;i<nums.length;i++) { int cnt=1; for(int
	 * j=0;j<nums.length;j++) { if(i!=j) { cnt*=nums[j]; } } result[i]=cnt; }
	 * 
	 * return result;
	 * 
	 * }
	 */

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int cnt = 1;
		int zeroCnt = 0;
		for (int num : nums) {
			if (num != 0)
				cnt *= num;
			else
				zeroCnt++;
		}
		for (int i = 0; i < result.length; i++) {
			if (zeroCnt > 0 && nums[i] != 0)
				result[i] = 0;
			else if (nums[i] != 0)
				result[i] = cnt / nums[i];
		}
		return result;
	}
}
