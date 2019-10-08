package com.mhsn.linkedList.duplicate;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;

public class RemoveDuplicatesFromSortedList {

	public static Node removeDuplicatefromSortedList(Node head){
		 
		 Node current = head;
		 while(current !=null && current.next !=null){
			 Node temp = current.next.next;
			 if(current.value == current.next.value)
				 current.next = temp;
			 if(temp == null)
				 break;
			 if(current.value != current.next.value)
				 current = current.next;
			 		 
		 }
		 
		 
		 return null;
	 }
	
	
	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.addNode(1); list.addNode(1); list.addNode(2); list.addNode(3); 
		list.addNode(4); list.addNode(4); list.addNode(5); list.addNode(5);
		list.addNode(6);
		LinkedListUtils.printLink(list.head);
		removeDuplicatefromSortedList(list.head);
		LinkedListUtils.printLink(list.head);
		
	}
	
	
	
	
}
