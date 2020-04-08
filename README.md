# leetCode30Day
leetcode 30일 챌린지
---
 
 https://leetcode.com/ 에서 코로나로 인해 나가지 못하는 방구석 개발자들을 위해 30일 코딩 챌린지를 오픈했습니다.
 
 앞으로 30일동안 꾸준히 문제를 풀어서 올려보려 합니다. 
 
 피드백 부탁드립니다.
 
1Day
---

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
<pre>
Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
</pre>

2Day
---

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
<pre>
Example:
Input: 19
Output: true
Explanation: 
1<sup>2</sup> + 9<sup>2</sup> = 82
8<sup>2</sup> + 2<sup>2</sup> = 68
6<sup>2</sup> + 8<sup>2</sup> = 100
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
</pre>


3Day
---

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
<pre>
Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
</pre>
Follow up:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.


4Day
---

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
<pre>
Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
</pre>
Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

5Day
---
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

<pre>
Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
</pre>

