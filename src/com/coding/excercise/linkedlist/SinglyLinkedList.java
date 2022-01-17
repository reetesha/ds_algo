package com.coding.excercise.linkedlist;

public class SinglyLinkedList {
	
	static Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public SinglyLinkedList insert(SinglyLinkedList list, int data) {
		
		Node node = new Node(data);
		node.next=null;
			
		if(list.head ==null) {
			list.head=node;
		}
		else {
			
			Node last= list.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = node;
		}
		
		
		return list; 
	}
	
	public void printList(Node node) {
		
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public Node travseList(SinglyLinkedList list) {
		
		Node current = list.head, next=null, prev=null;
	
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current = next;
		}
		return prev;
	}
	
	
	public Node kAltReverse(Node node,int k) {
		Node current = node;
	    Node next = null, prev = null;
		
		int count = 0;
		  
        /*1) reverse first k nodes of the linked list */
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
  
        /* 2) Now head points to the kth node.  So change next 
         of head to (k+1)th node*/
        if (node != null) {
            node.next = current;
        }
  
        /* 3) We do not want to reverse next k nodes. So move the current 
         pointer to skip next k nodes */
        count = 0;
        while (count < k - 1 && current != null) {
            current = current.next;
            count++;
        }
  
        /* 4) Recursively call for the list starting from current->next.
         And make rest of the list as next of first node */
        if (current != null) {
            current.next = kAltReverse(current.next, k);
        }
  
        /* 5) prev is new head of the input list */
        return prev;
	}


	public static void main(String arg[]) {
	
		SinglyLinkedList list = new SinglyLinkedList();
		
		list = list.insert(list, 1);
		list = list.insert(list, 2);
		list = list.insert(list, 3);
		list = list.insert(list, 4);
		list = list.insert(list, 5);
		list = list.insert(list, 6);
		list = list.insert(list, 7);
		list = list.insert(list, 8);
		list = list.insert(list, 9);
		
		list.printList(head);
		System.out.println("########################################");
		head=list.kAltReverse(head, 3);
		 //head = list.travseList(list);
		System.out.println("########################################");
		list.printList(head);
		
		
	}

}
