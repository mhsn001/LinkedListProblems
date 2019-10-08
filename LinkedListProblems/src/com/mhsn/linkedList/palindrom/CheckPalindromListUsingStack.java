package com.mhsn.linkedList.palindrom;

import java.util.Stack;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;


public class CheckPalindromListUsingStack {

	public static boolean isListpalindromeUsingStack(Node head){

		if(head == null){
			return false;
		}else if(head.next == null) {
			return true;
		}
		Node slow = head;
		Node fast = head;
		Node secondHead = null;
		Stack<Integer> stack = new Stack<>();
		//stack.push(slow.value);
		while(true){
			stack.push(slow.value);
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == null)//if length is even
			{
				secondHead = slow;
				break;
			}
			if(fast.next == null)//if length is odd
			{
				secondHead = slow.next;
				break;
			}
				
		}
		//printLink(secondHead);
		//System.out.println(stack);
		while(secondHead != null ){
			
			if(stack.pop() != secondHead.value){
				return false;
			}
			secondHead = secondHead.next;
			}

		return true;
	}
	
	
	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(20);
		list.addNode(10);
		LinkedListUtils.printLink(list.head);
		boolean isPalindrome = isListpalindromeUsingStack(list.head);
		System.out.println("isPalindrome : "+isPalindrome);
	}
	
}
