package com.mhsn.linkedList;

public class LinkedListMain {

	
	public static void main(String[] args) {
		
		
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("########## Add Nodes: head #############");
		//int position = 5, value = 10;
				list.addNode(70);
				list.addNode(50);
				list.addNode(50);
				list.addNode(30);
				list.addNode(40);
				list.addNode(60);
				list.addNode(100);
				list.addNode(90);
				list.addNode(80);
				list.addNode(70);
				list.addNode(11);
		LinkedListUtils.printLink(list.head);
		
		list.insertNodesAt(20, 5);
		
		LinkedListUtils.printLink(list.head);
		
	}
}
