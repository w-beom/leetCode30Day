/*
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 
(where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
package leetCode30Day;

public class Day2 {

	public static void main(String[] args) {
		System.out.println(isHappy(2));
	}

	public static boolean isHappy(int n) {
		int sum = 0;
		int length;
		int cnt=0;
		while (cnt<10) {
			length = (int) (Math.log10(n) + 1);
			for (int i = 0; i < length; i++) {
				sum += Math.pow((n % 10), 2);
				n /= 10;
			}
			System.out.println(sum);
			if (sum == 1) {
				return true;
			} else {
				n = sum;
				sum = 0;
			}
			cnt++;
		}
		return false;
	}

}
