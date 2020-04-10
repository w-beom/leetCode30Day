package leetCode30Day;


public class Day8 {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		listNode.next.next.next.next.next = new ListNode(6);

		ListNode result = middleNode(listNode);
		System.out.println(result.val);

	}

	public static ListNode middleNode(ListNode head) {
		ListNode node = head;
		ListNode resultNode = head;
		while (resultNode != null && resultNode.next != null) {
			node = node.next;
			resultNode = resultNode.next.next;
		}

		return node;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
