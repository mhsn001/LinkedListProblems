package com.mhsn.linkedList.merge;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;


public class MergeTwoSortedLinkedLists {

	
	public static Node mergeTwoSortedListsUsingItration(Node head1, Node head2){
		
		Node dummyHead = new Node();
	
		if(head1 == null && head2 == null){
			return null;
		}else if(head1 == null || head2 == null){
			return head1 != null ? head1 : head2;
		}
		Node l1 = head1;
		Node l2 = head2;
		Node l3 = dummyHead;
		
		while(l1 != null && l2 !=null){
			
			if(l1.value <= l2.value){
				l3.next = l1;
				l1 = l1.next;
			}else{
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
			
			if(l1 == null){
				l3.next = l2;
				break;
			}
			if(l2 == null){
				l3.next = l1;
				break;
			}
		}
		return dummyHead.next; 
	}

	
	public static void main(String[] args) {
		
		MyLinkedList list1 = new MyLinkedList();
		list1.addNode(5); list1.addNode(13); list1.addNode(20); 
		list1.addNode(21); list1.addNode(29);
		
		MyLinkedList list2 = new MyLinkedList();
		list2.addNode(3); list2.addNode(10); list2.addNode(17); 
		list2.addNode(25); list2.addNode(37); list2.addNode(40); list2.addNode(43);
		
		LinkedListUtils.printLink(list1.head);
		LinkedListUtils.printLink(list2.head);
		
		Node newHead = mergeTwoSortedListsUsingItration(list1.head, list2.head);
		
		LinkedListUtils.printLink(newHead);
		
		
		
		
	}
	

	
}
