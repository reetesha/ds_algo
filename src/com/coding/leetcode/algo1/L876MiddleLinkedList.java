package com.coding.leetcode.algo1;

public class L876MiddleLinkedList {

	public ListNode removeNNodeFromEnd(ListNode head,int n) {
		ListNode temp1=head,temp2=head;
		int count=0;
		//count the linked list length
		if(n==0) return head;
		while(temp1!=null) {
			temp1=temp1.next;
			count++;
		}
		
		int removeNode = count-n;
		
		if(removeNode==0) {
			if(count==n) {
				System.out.println("count==n");
			}
			head=head.next;
			return head;
		}
		else if (removeNode==1) {
			head.next=head.next.next;
			return head;
		}

		//remove nth node from last logic
		int count1=1;
		while(temp2!=null) {
			temp2=temp2.next;
			count1++;
			if(count1==removeNode) {
				temp2.next=temp2.next.next;
				break;
			}
		}
		
		return head;		
	}
	
	
	public static void main(String arg[]) {
		L876MiddleLinkedList l= new L876MiddleLinkedList();

		ListNode node5 = new ListNode(5);

		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode head = new ListNode(1,node2);
		
		//Iterate ListList
		ListNode temp = head;
		while(temp!=null)
		{
		System.out.println(temp.val);
		temp=temp.next;
		}
		int n=2;
		ListNode result= l.removeNNodeFromEnd(head,2);
		
		while(result!=null)
		{
		System.out.println(result.val);
		result=result.next;
		}
	}
}
