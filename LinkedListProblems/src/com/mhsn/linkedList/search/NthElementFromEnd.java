package com.mhsn.linkedList.search;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;


public class NthElementFromEnd {

	
public static Node findNthElementFromTheEnd(Node head, int nthPosition){
		
		Node fastNode = head;
		Node slowNode = head;
		int count = 1;
		while(fastNode.next != null){
			if(count >= nthPosition){
				fastNode = fastNode.next;
				slowNode = slowNode.next;
			}else{
				fastNode = fastNode.next;
				count++;
				}
		}
		
		if(count != nthPosition){
			slowNode = null;
		}
		
		return slowNode; 
	}
	
	
public static void main(String[] args) {
	
	MyLinkedList list = LinkedListUtils.iniitiateDefaultLinkedList();
	LinkedListUtils.printLink(list.head);
	Node n = findNthElementFromTheEnd(list.head, 4);
	System.out.println("Required Element : "+ n.value);
	
}


	
	
}
