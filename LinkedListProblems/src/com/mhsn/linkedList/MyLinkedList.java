package com.mhsn.linkedList;


public class MyLinkedList {

	
	public Node head; 
	public MyLinkedList(){}
	
	public MyLinkedList(Node head){
		this.head = head;
	}
		
	//inserting node at the end
	public Node addNode(int value){
		
		Node temp = head;
		Node node = new Node(value);
		if(temp == null){
		//System.out.println("Adding head "+ value);	
		head = node;	
		return head;
		}
		
		while(temp != null){
			if(temp.next == null){
				//System.out.println("Adding noda at the end "+ value);
				temp.next = node;
				break;
			}else{
				temp = temp.next;
			}
		}
		return node;
	}
	

	//indexing starts with zero 
	//inserting node at given index
	public Node insertNodesAt(int value, int position){
		
		System.out.println("Insert node "+value+" at index " +position);
		int count = 0;
		Node temp = head;
		Node previousNode = head;
		Node node = new Node(value);	
		
		//if no elements
		if(temp == null){
		System.out.println("No elements, Adding head "+ value);
		head = node;	
		return head;
		}
		
		// if its 1st position
		if(position == 0){
			node.next = temp;
			head = node;
			return head;
		}
		
		while(temp != null){
			if(count == position){
				previousNode.next = node;
				node.next = temp;
				return head;
			}
			previousNode = temp;
			temp = temp.next;
			count++;
		}
		
		System.out.println("Position out of range, No element added.");
		return head;
	}
	
	//delete a node by given value
	public void deleteNode(int value){
		Node temp = head;
		
		if(temp == null){
			System.out.println("No Element found to delete");
			return;
		}else if(temp.value == value){
			head = head.next;
			System.out.println("DELETED");
			temp = null;
			return;
		}
		
		while(temp.next != null){
						
			if(temp.next.value == value){
				temp.next = temp.next.next;
				System.out.println("DELETED");
				return;
			}
			temp = temp.next;
			
		}
		System.out.println("This elemnet does not exist in the list.");
		
	}
	
	
	
	
}
