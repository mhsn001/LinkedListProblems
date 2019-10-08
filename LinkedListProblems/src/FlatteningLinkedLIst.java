

public class FlatteningLinkedLIst {

	public static void flattenLinkedList(TwoWayNode head){
		
		//System.out.println(" head value "+head.value);
		TwoWayNode mergedNode = mergeMultiLevelList(head, head.next);
		TwoWayNode temp4 = mergedNode;
		while(temp4!=null){
			System.out.print(" "+temp4.value);
			temp4 = temp4.down;
			
		}
	}
	
	public static TwoWayNode mergeMultiLevelList(TwoWayNode  head, TwoWayNode right){
		
		TwoWayNode temp1 = head;
		TwoWayNode temp2 = right;
		//System.out.println(" temp1 : "+temp1.value +" :: temp2 : "+temp2.value);	
		TwoWayNode dummyNode = new TwoWayNode();
		TwoWayNode node = dummyNode;
		while(temp1 != null && temp2!= null){
			
			if(temp1.value <= temp2.value){
				
				node.down = temp1;
				temp1= temp1.down;
			}else{
				node.down = temp2;
				temp2 = temp2.down;
			}
			
			node = node.down;
			
		}
		
	if(temp1 !=null){
		node.down = temp1;
	}
	if(temp2 != null){
		node.down = temp2;
	}
	if(right.next != null){
		mergeMultiLevelList(dummyNode.down, right.next);
	}
		return dummyNode.down;
	}
	
	
	public static TwoWayNode createMultilavelList(){
		
		TwoWayNode n1 = new TwoWayNode(45, null,null);
		TwoWayNode n2 = new TwoWayNode(40, null,n1);
		TwoWayNode n3 = new TwoWayNode(35, null,n2);
		/*TwoWayNode n4 = new TwoWayNode(28, null,n3);*/
		TwoWayNode right1 = new TwoWayNode(28, null,n3);
		
		TwoWayNode n4 = new TwoWayNode(50, null,null);
		TwoWayNode n5 = new TwoWayNode(22, null,n4);
		TwoWayNode right2 = new TwoWayNode(19, right1,n5);
		
		TwoWayNode n6 = new TwoWayNode(20, null,null);
		TwoWayNode right3 = new TwoWayNode(10, right2,n6);
		
		TwoWayNode n7 = new TwoWayNode(30, null,null);
		TwoWayNode n8 = new TwoWayNode(8, null,n7);
		TwoWayNode n9 = new TwoWayNode(7, null,n8);
		
		TwoWayNode head = new TwoWayNode(5, right3,n9);
			
		return head;
	}
	
	
	public static void main(String[] args) {
		
		TwoWayNode head = createMultilavelList();
		
		flattenLinkedList(head);
		
		
	}
	
	
	
	
}



class TwoWayNode{
	
	public int value;
	public TwoWayNode next;
	public TwoWayNode down;
	
	public TwoWayNode(int value, TwoWayNode next, TwoWayNode down){
		this.value = value;
		this.next = next;
		this.down = down;
	}
	
	public TwoWayNode(){}
	
}
