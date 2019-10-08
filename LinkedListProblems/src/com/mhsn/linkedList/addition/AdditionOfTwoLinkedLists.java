package com.mhsn.linkedList.addition;

import java.awt.List;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;



public class AdditionOfTwoLinkedLists {
	public static Node addTwoNumbersRepresentedByList(Node head1, Node head2){

		Node temp1 = head1;
		Node temp2 = head2;
		int length1 = 1;
		int length2 = 1;
		
		//Calculating the first link list length
		while(temp1.next != null){
			temp1 = temp1.next;
			length1++;
		}
		//Calculating the second link list length
		while(temp2.next != null){
			temp2 = temp2.next;
			length2++;
		}
		//System.out.println("L1 : "+length1 +" :: L2 : "+length2);	
		
		int count = 0;
		// Padding link list with zeros in front side of the link list which is shorter in length.
		if(length1 < length2){
			count = length2 - length1;
			while(count>0){
				Node n = new Node(0);
				n.next = head1;
				head1 = n;
				count--;
			}
		}else{
			count = length1 - length2;
			while(count>0){
				Node n = new Node(0);
				n.next = head2;
				head2 = n;
				count--;
			}
		}
			
		/*printLink(head1);
		printLink(head2);*/
			
		Node node = reveseListforAdding(head1, head2);
		
		if(node.value >= 10){
			//carry = 1;
			Node temp = node;
			temp.value = temp.value%10; // putting only remainder
			
			node = new Node(1); //adding carry to the last node
			node.next = temp;
		}	

		//printLink(node);
		return node;
		
	}

	public static Node reveseListforAdding(Node temp1, Node temp2){
		
		if(temp1.next == null ){
			return new Node(temp1.value + temp2.value);
		}
		Node node = reveseListforAdding(temp1.next, temp2.next);
		Node newNode = new Node(temp1.value + temp2.value);
		/*double remainder = node.value/10.0;
		int carry = 0;*/
		if(node.value >= 10){
			//carry = 1;
			node.value = node.value%10; // putting only remainder in the node
			newNode.value = newNode.value + 1; // adding carry
		}	
		newNode.next = node;
		return newNode;
	}
	
	
	public static void main(String[] args) {
		
		MyLinkedList list1 = new MyLinkedList();
		list1.addNode(2); list1.addNode(7); list1.addNode(2); list1.addNode(8); 
		
		MyLinkedList list2 = new MyLinkedList();
		list2.addNode(8); list2.addNode(7); list2.addNode(9); 
		
		LinkedListUtils.printLink(list1.head);
		System.out.println("    + \n");
		LinkedListUtils.printLink(list2.head);
		
		Node additionNode = addTwoNumbersRepresentedByList(list1.head, list2.head);
		System.out.println("    =  \n");
		LinkedListUtils.printLink(additionNode);
	}
	
}

