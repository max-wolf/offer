class ListNode {
	int val;
	ListNode next = null;
	
	ListNode(int val) {
		this.val = val;
	}
}

public class Solution {
	public ListNode ReverseList(ListNode head) {
		if(head == null)
			return null;
		if(head.next == null)
			return head;
		ListNode pReverseHead = null;
		ListNode pNode = head;
		ListNode pNext = null;
		ListNode pPre = null;
		while(pNode != null) {
			pNext = pNode.next;
			if(pNext == null)
				pReverseHead = pNode;
			pNode.next = pPre;
			pPre = pNode;
			pNode = pNext;
		}
		return pReverseHead;
	}
}
