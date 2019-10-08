package com.mhsn.linkedList.palindrom;

import java.util.LinkedList;
import java.util.Stack;

import com.mhsn.linkedList.LinkedListUtils;
import com.mhsn.linkedList.MyLinkedList;
import com.mhsn.linkedList.Node;
import com.mhsn.linkedList.reverse.ReverseLinkedListUsingItreation;

public class CheckPalindormListUsingSplitAndReverse {

	
	public static boolean isListpalindromeUsingSplitAndRevrse(Node head){	
		
		if(head == null){
			return false;
		}
		Node slow = head;
		Node fast = head;
		Node secondHead = null;
		
		while(true){
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
		//LinkeListUtils.printLink(secondHead);
		Node reverseHead = ReverseLinkedListUsingItreation.reverseLinkedListByItration(secondHead);
	//	LinkeListUtils.printLink(reverseHead);
	//	LinkeListUtils.printLink(head);
		slow = head;
		while(reverseHead != null ){
			
			if(slow.value != reverseHead.value){
				return false;
			}
			
			reverseHead = reverseHead.next;
			slow = slow.next;
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
				boolean isPalindrome = isListpalindromeUsingSplitAndRevrse(list.head);
				System.out.println("isPalindrome : "+isPalindrome);
			}
	
}
