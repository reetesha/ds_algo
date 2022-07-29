package com.coding.leetcode.algo1;

public class L19RemoveNNodeFromEndList {

	public ListNode middlelist(ListNode head) {
		ListNode l1=head,l2=head,temp=head;
		while(temp.next!=null) {
			l1=l1.next;
			if(l2.next!=null || l2.next.next!=null) {
				l2=l2.next.next;
			}
			temp=temp.next;
			if(l2==null || l2.next==null) {
				return l1;
			}
		}
		
		return head;		
	}
	
	
	public static void main(String arg[]) {
		L19RemoveNNodeFromEndList l= new L19RemoveNNodeFromEndList();

		ListNode node5 = new ListNode(5);

		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3);
		ListNode node2 = new ListNode(2,node3);
		ListNode head = new ListNode(1,node2);
		
		//Iterate ListList
		ListNode temp = head;
		while(temp!=null)
		{
		System.out.println(temp.val);
		temp=temp.next;
		}
		ListNode result= l.middlelist(head);
		while(result!=null)
		{
		System.out.println(result.val);
		result=result.next;
		}
	}
}
