package com.leetcode;

import com.code.*;

public class Add_Two_Number_2 {
	ListNode head;

	public ListNode addinlink(int add) {
		ListNode nayi = new ListNode(add);
		if (head == null)
			head = nayi;
		else {
			ListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nayi;

		}

		return head;

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Add_Two_Number_2 a = new Add_Two_Number_2();
		int carry = 0;
		while (l1.next != null || l2.next != null || carry > 0) {
			int x = l1 != null ? l1.val : 0;
			int y = l1 != null ? l2.val : 0;
			int sum = x + y + carry;
			a.addinlink(sum % 10);
			if (sum >= 10) {
				carry = 1;
			}

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}

		return a.head;
	}

	public static void main(String[] args) {

	}

}
