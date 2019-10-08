package com.mhsn.linkedList.reverse;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;

public class ReverseLinkedListUsingRecursion {
	
	private static Node newHead;

	public static Node reverseLinkedListByRecursion(Node current){
		
		if(current.next == null){
			newHead = current;
			return current;
		}
		
		// Before the same method call linked list will traverse in forward dirction 
		Node prev = reverseLinkedListByRecursion(current.next);
		//After method call finished linked list will traverse back in backward direction
		//Node prev stores the last visited node while reversing back So that last two elements can reverse themselves
		
		prev.next = current; // 
		current.next = null;
		
		return current; // at last previous to be returned
	}
	
	public static void main(String[] args) {
		MyLinkedList list = LinkedListUtils.iniitiateDefaultLinkedList();
		LinkedListUtils.printLink(list.head);
		reverseLinkedListByRecursion(list.head);
		LinkedListUtils.printLink(newHead);
	}
}
