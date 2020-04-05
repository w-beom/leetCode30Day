package leetCode30Day;

public class Day5 {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 4, 5 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int result = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i]) {
				result += (prices[i + 1] - prices[i]);
			}
		}
		return result;
	}

}
