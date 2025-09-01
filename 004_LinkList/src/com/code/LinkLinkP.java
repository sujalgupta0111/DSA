package com.code;

public class LinkLinkP {
	
  ListNode head;
  
  public void add(int data)
  {
	  ListNode nayi = new ListNode(data);
	  if(head == null)
	  {
		  head= nayi ;
	  }else
	  {
		 ListNode temp = head;
		  while(temp.next != null)
		  {
			  temp = temp.next;
		  }
		  temp.next = nayi;
		  
	  }
  }
  
  public void print()
  {
	  ListNode temp = head;
	  
	  while(temp != null)
	  {
		  System.out.println(temp.val);
		  temp = temp.next;
		  
	  }
	  
  }
	

}
