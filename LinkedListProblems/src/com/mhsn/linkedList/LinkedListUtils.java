package com.mhsn.linkedList;

public class LinkedListUtils {

	// printing link list
		public static void printLink(Node head){
			Node temp = head;
			if(temp == null){
				System.out.println("Sorry... No elements to print");
				return;
			}else{
				System.out.print("Elements : ");
			}
			while(temp != null){
				System.out.print(temp.value+ " " );
				temp = temp.next;
			}
			System.out.println("\n");
		}
		
		
		
		public static MyLinkedList iniitiateDefaultLinkedList(){
			
			MyLinkedList list = new MyLinkedList();
			
			//System.out.println("########## A #############");
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
			//LinkeListUtils.printLink(list.head);
			
			return list;
			
		}
	
}
