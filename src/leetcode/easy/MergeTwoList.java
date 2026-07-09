package leetcode.easy;

/**
 * Definition for singly-linked list.
 */
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { 
    	  this.val = val; 
    	  next =null;
    	  }
      ListNode(int val, ListNode next) { 
    	  this.val = val;
    	  this.next = next;
    	  }
  }
 
public class MergeTwoList {

	public static void main(String[] args) {
		
		ListNode n1=new ListNode(1);
		n1.next=new ListNode(2);
		n1.next.next=new ListNode(4);
		
		ListNode n2=new ListNode(1);
		n2.next=new ListNode(2);
		n2.next.next=new ListNode(3);
		
		System.out.println(mergeTwoLists(n1,n2).val);
		
	}
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		if(l1!=null & l2!=null) {
			if(l1.val < l2.val) {
				l1.next=mergeTwoLists(l1.next,l2);
				return l1;
			}else {
				l2.next=mergeTwoLists(l1,l2.next);
				return l2;
			}
		}
		if(l1==null)
			return l2;
		return l1;
		
	}

}
