package leetCode30Day;

import java.util.ArrayList;
import java.util.List;

public class Day10 {

	List<Integer> stack;

	public Day10() {
		stack = new ArrayList<Integer>();
	}

	public void push(int x) {
		stack.add(0, x);
	}

	public void pop() {
		stack.remove(0);
	}

	public int top() {
		return stack.get(0);	

	}

	public int getMin() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < stack.size(); i++) {
			if (min > stack.get(i)) {
				min = stack.get(i);
			}
		}

		return min;

	}

	public static void main(String[] args) {
		Day10 obj = new Day10();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
	}
}
