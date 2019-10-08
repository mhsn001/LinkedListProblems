package com.mhsn.linkedList.reverse;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;


public class ReverseLinkedListUsingItreation {

	
	//Reverse the linked list using Iterator.
		public static Node reverseLinkedListByItration(Node head){
					
			Node prev = null;
			Node current = head;
			Node nextNode = head;
			while(nextNode != null){
				current = nextNode; // current node which is to be operated
				nextNode = current.next; // saving nextNode for traverser
				current.next = prev; // assigning the address of previous node to current node (reversing the link here)
				prev = current; // Storing the previous node
			}
			
			return prev; // at last previous will be returned
		}
		
		
	public static void main(String[] args) {
		
	MyLinkedList list = LinkedListUtils.iniitiateDefaultLinkedList();
	LinkedListUtils.printLink(list.head);
	list.head = reverseLinkedListByItration(list.head);
	LinkedListUtils.printLink(list.head);
		
	}
	
	
}
