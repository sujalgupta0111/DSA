package com.code;

public class Node {
	int data;
	Node next;

	Node() {
	}

	Node(int data) {
		this.data = data;
	}

	Node(Node next) {
		this.next = next;
	}

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

}

class Nodeop {
	Node head;

	public void add(int data) {
		Node nayi = new Node(data);
		if (head == null) {
			head = nayi;
		} else {
			Node temp = head;
			
			while(temp.next!=null)
			{
				temp = temp.next;
				
			}
			temp.next = nayi;

		}
	}
	public void print()
	{
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}