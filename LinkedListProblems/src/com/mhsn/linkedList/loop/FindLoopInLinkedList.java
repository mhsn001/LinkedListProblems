package com.mhsn.linkedList.loop;

import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;



public class FindLoopInLinkedList {

	
public static Node checkIfLinkedListIslooped(Node head){
	
	Node slowPointer = head; 
	Node fastPointer = head; 
	
	while(fastPointer != null && fastPointer.next !=null){
	//	System.out.println("fastPointer : "+fastPointer.value +" :: slowPointer : "+slowPointer.value );
		fastPointer = fastPointer.next.next;
		slowPointer = slowPointer.next;
		if(fastPointer == slowPointer){
			System.out.println("MEETING POINTS ::: fastPointer : "+fastPointer.value +" :: slowPointer : "+slowPointer.value );
			return fastPointer;// or slow pointer also can be sent
		}
		
		}
	
	return null;
}	


public static Node findStartingNodeOfLoop(Node head, Node meetingPoint){
		
	Node listStartPoint = head;
	while(true){
		//System.out.println("Metting point :"+meetingPoint.value+" :: Starting poin :"+listStartPoint.value);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(meetingPoint == listStartPoint){
			return meetingPoint;
		}
		listStartPoint = listStartPoint.next;
		meetingPoint = meetingPoint.next;
	}
	
}

private static MyLinkedList createLoopedLinkedList() {
	
	MyLinkedList list = new MyLinkedList();
	list.addNode(10);
	list.addNode(20);
	list.addNode(30);
	Node loopStartNode = list.addNode(40);
	list.addNode(50);
	list.addNode(60);
	list.addNode(70);
	list.addNode(80);
	list.addNode(90);
	list.addNode(100);
	Node loopEndNode = list.addNode(110);
	loopEndNode.next = loopStartNode;
	return list;
}


public static void main(String[] args) {
	MyLinkedList list = createLoopedLinkedList();
	
	Node meetingPoint = checkIfLinkedListIslooped(list.head);
	if(meetingPoint != null){
		System.out.println("Is linked list is looped : " +true);
		Node startPoint = findStartingNodeOfLoop(list.head, meetingPoint);
		System.out.println("Start point of the loop is : " +startPoint.value);
	}else {
		System.out.println("There is no loop in the linked list");
	}
	
	
	
}
}
